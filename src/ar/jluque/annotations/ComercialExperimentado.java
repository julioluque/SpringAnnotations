package ar.jluque.annotations;

import org.springframework.stereotype.Component;

@Component("comercial")
public class ComercialExperimentado implements Empleados {

	@Override
	public String getTareas() {
		return "Comercial. Tarea: vender, vender y vender...";
	}

	@Override
	public String getInformes() {
		return " INFORME generado por el comercial";
	}

}
