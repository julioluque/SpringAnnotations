package ar.jluque.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotations2 {

	public static void main(String[] args) {

		// Llama al archivo de confiugracion xml para escanear las anotaciones.
		ClassPathXmlApplicationContext contenedor = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Pedimos dos beanes, para ver si apuntan al mismo objeto en memmoria.
		Empleados emp1 = contenedor.getBean("comercialExperimentado", Empleados.class);
		Empleados emp2 = contenedor.getBean("comercialExperimentado", Empleados.class);

		if (emp1.equals(emp2)) {
			System.out.println("apuntan al mismo lugar en memoria");
		} else {
			System.out.println("No apuntan al mismo lugar en memoria");
		}
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		contenedor.close();
		
		System.out.println("------------------------");
		
		// Llama al archivo de configuracion java para escanear las anotaciones
		AnnotationConfigApplicationContext contenedorAnot = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		Empleados e1 = contenedorAnot.getBean("directorFinanciero", Empleados.class);
		System.out.println(e1.getTareas());
		System.out.println(e1.getInformes());
		contenedorAnot.close();
		
	}
}
