package ar.jluque.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero4 implements Informes{

	@Override
	public String getInformeFinanciero() {
		return "Infomre financiero 4. Sos el elegido!!!";
	}

}
