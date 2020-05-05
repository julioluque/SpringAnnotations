package ar.jluque.annotationsonly;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ar.jluque.annotationsonly.personal.Personal;
import ar.jluque.annotationsonly.personal.PersonalImpl;

public class AccesoPrincipalAnotaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(applicationConfig.class);
		Personal miReporte = context.getBean("personalImpl", Personal.class);
		System.out.println(miReporte.getTareas());
		System.out.println(miReporte.getPresentacion());

		PersonalImpl fichaTecnica = context.getBean("personalImpl", PersonalImpl.class);
		System.out.println(fichaTecnica.getNombre());
		System.out.println(fichaTecnica.getEmail());
		System.out.println(fichaTecnica.getEmpresa());
		System.out.println(fichaTecnica.getDireccion());

		context.close();

	}

}
