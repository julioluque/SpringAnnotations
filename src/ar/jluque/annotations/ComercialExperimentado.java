package ar.jluque.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {
	
	/**
	 * @Autowired -> 4 OPCIONES, pero solo lo puedo usar en un ...
	 * 1 CAMPO DE CLASE -> Spring lo usa por medio de reflection
	 * 2 CONSTRUCTOR -> Cuando hay sobre carga de constructores. Si hay solo uno, Spring lo invoca por defecto
	 * 3 SETTER -> Opcional, pero muy usado cuando hay sobrecarga de constructores.
	 * 4 METODO -> Misma funcionalidad que un setter, pero apto para cualquier tipo de metodo.
	 */
	
	@Autowired
	private Informes informes;
	
	public ComercialExperimentado() {
	}
	
//	@Autowired
	public ComercialExperimentado(Informes informes) {
		this.informes = informes;
	}
	
	
//	@Autowired
	public void setInformes(Informes informes) {
		this.informes = informes;
	}

//	@Autowired
	public void metodoNormal(Informes informes) {
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
