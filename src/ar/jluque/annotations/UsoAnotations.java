package ar.jluque.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotations {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados comercial = contexto.getBean("comercialExperimentado", Empleados.class);
		System.out.println("Tareas: " + comercial.getTareas());
		System.out.println("Infomres: " + comercial.getInformes());

		Empleados nuevoEmpleado = contexto.getBean("comercialPrincipiante", Empleados.class);
		System.out.println("Tareas: " + nuevoEmpleado.getTareas());
		System.out.println("Infomres: "+ nuevoEmpleado.getInformes());
		
		contexto.close();
	}

}
