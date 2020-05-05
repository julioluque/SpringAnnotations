package ar.jluque.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class DirectorFinanciero implements Empleados {

	@Value("${email}")
	private String correoElectronico;
	
	@Value("${nombreEmpresa}")
	private String nombreMiEmpresa;
	
	private Informes informes;

	public DirectorFinanciero(Informes informes) {
		this.informes = informes;
	}

	
	
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	
	public String getNombreMiEmpresa() {
		return nombreMiEmpresa;
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
