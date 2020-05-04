package ar.jluque.annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class DirectorFinanciero implements Empleados {

	private Informes informes;

	public DirectorFinanciero(Informes informes) {
		this.informes = informes;
	}

	@Override
	public String getTareas() {
		return "Dirigir el departamento de finanzas";
	}

	@Override
	public String getInformes() {
		return "Informe sobre revision de:: " + informes.getInformeFinanciero();
	}

}
