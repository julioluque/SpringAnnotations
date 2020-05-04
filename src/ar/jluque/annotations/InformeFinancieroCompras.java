package ar.jluque.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroCompras implements Informes {

	@Override
	public String getInformeFinanciero() {
		return "Implementacion del informe financierdo del deptartamento de compras 2020";
	}

}
