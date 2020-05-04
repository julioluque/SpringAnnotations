package ar.jluque.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class DirectorFinanciero implements Empleados {

	private InformeFinancieroCompras informefinancieroCompras;
	
	@Autowired
	public DirectorFinanciero(InformeFinancieroCompras informeFinancieroCompras) {
		this.informefinancieroCompras = informeFinancieroCompras;
	}
	
	@Override
	public String getTareas() {
		return "Dirigir el departamento de finanzas";
	}

	@Override
	public String getInformes() {
		return "Informe sobre revision de:: " + informefinancieroCompras.getInformeFinanciero();
	}
	
	@PostConstruct
	private void init() {
		System.out.println("CONTROL METODO INIT()");
	}
	
	@PreDestroy
	private void end() {
		System.out.println("CONTROL METODO DESTROY()");
	}

}
