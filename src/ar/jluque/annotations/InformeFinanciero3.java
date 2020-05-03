package ar.jluque.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero3 implements Informes{

	@Override
	public String getInformeFinanciero() {
		return "Infomre financiero 3";
	}

}
