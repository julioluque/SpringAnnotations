package ar.jluque.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotations {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados comercial = contexto.getBean("comercial", Empleados.class);
		
		System.out.println("Tareas: " + comercial.getTareas());
		System.out.println("Infomres: " + comercial.getInformes());
		
		contexto.close();
		
		
	}

}
