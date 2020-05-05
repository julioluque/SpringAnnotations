package ar.jluque.annotationsonly.personal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ar.jluque.annotationsonly.reportes.Reportes;

@Component
@Scope("singleton")
public class PersonalImpl implements Personal {

	@Value("${nombre.persona}")
	private String nombre;

	@Value("${nombre.empresa}")
	private String empresa;

	@Value("${direccion.email}")
	private String email;

	@Value("${direccion.empresa}")
	private String direccion;

	private Reportes reportes;

	@Autowired
	public PersonalImpl(Reportes reportes) {
		this.reportes = reportes;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getEmail() {
		return email;
	}

	public String getEmpresa() {
		return empresa;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Tareas del personal A";
	}

	@Override
	public String getPresentacion() {
		// TODO Auto-generated method stub
		return "Presentacion del personal A." + reportes.getReportes();
	}

	@PostConstruct
	public void inicioBean() {
		System.out.println("INIT...");
	}

	@PreDestroy
	public void finBean() {
		System.out.println("DESTROY...");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Datos Tecnicos=[Nombre=" + nombre + ", Empresa=" + empresa + ", Email=" + email + ", Direccion="
				+ direccion + "]";
	}
}
