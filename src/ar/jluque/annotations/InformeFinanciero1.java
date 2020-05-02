package ar.jluque.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero1 implements Informes {

	@Override
	public String getInformeFinanciero() {
		return "Presentacion del informe financiero del trimestre 1";
	}

}
