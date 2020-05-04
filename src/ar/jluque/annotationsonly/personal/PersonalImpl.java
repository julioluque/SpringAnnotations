package ar.jluque.annotationsonly.personal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ar.jluque.annotationsonly.reportes.Reportes;

@Component
@Scope("singleton")
public class PersonalImpl implements Personal {

	private Reportes reportes;

	@Autowired
	
	public PersonalImpl(Reportes reportes) {
		this.reportes = reportes;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Tareas del personal A";
	}

	@Override
	public String getPresentacion() {
		// TODO Auto-generated method stub
		return "Presentacion del personal A." + reportes.getReportes();
	}

	@PostConstruct
	public void inicioBean() {
		System.out.println("INIT...");
	}

	@PreDestroy
	public void finBean() {
		System.out.println("DESTROY...");
	}
}
