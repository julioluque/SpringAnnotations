package ar.jluque.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {
	
	
	private Informes informes;
	
	@Autowired
	public ComercialExperimentado(Informes informes) {
		this.informes = informes;
	}

	@Override
	public String getTareas() {
		return "Comercial. Tarea: vender, vender y vender...";
	}

	@Override
	public String getInformes() {
		return " INFORME generado por el comercial. |<INYECCION>| " + informes.getInformeFinanciero();
	}

}
