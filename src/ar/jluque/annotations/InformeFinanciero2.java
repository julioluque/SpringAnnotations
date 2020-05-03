package ar.jluque.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero2 implements Informes {

	@Override
	public String getInformeFinanciero() {
		return "Infomre financiero 2";
	}

}
