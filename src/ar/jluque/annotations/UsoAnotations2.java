package ar.jluque.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotations2 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contenedor = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Pedimos dos beanes, para ver si apuntan al mismo objeto en memmoria.
		Empleados emp1 = contenedor.getBean("comercialExperimentado", Empleados.class);
		Empleados emp2 = contenedor.getBean("comercialExperimentado", Empleados.class);

		if (emp1.equals(emp2)) {
			System.out.println("apuntan al mismo lugar en memoria");
			System.out.println(emp1.hashCode());
			System.out.println(emp2.hashCode());
		} else {
			System.out.println("No apuntan al mismo lugar en memoria");
			System.out.println(emp1.hashCode());
			System.out.println(emp2.hashCode());
		}

	}
}
