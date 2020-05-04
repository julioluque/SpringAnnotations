package ar.jluque.annotationsonly.reportes;

import org.springframework.stereotype.Component;

@Component
public class ReportesImpl implements Reportes {

	@Override
	public String getReportes() {
		// TODO Auto-generated method stub
		return "Implementacion de Informes presentados";
	}

}
