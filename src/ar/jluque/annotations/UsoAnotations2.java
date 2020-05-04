package ar.jluque.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnotations2 {

	public static void main(String[] args) {

		/**
		 * TRABAJANDO CON ARCHIVO CONFIGURACION XML
		 */
		ClassPathXmlApplicationContext contextXml = new ClassPathXmlApplicationContext("applicationContext.xml");
		Empleados emp1 = contextXml.getBean("comercialExperimentado", Empleados.class);
		System.out.println(emp1.getTareas());
		System.out.println(emp1.getInformes());
		contextXml.close();
		System.out.println("------------------------");

		/**
		 * TRABAJANDO CON ARCHIVO CONFIGURACION JAVA
		 */
		AnnotationConfigApplicationContext contextJava = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		Empleados e1 = contextJava.getBean("directorFinanciero", Empleados.class);
		System.out.println(e1.getTareas());
		System.out.println(e1.getInformes());
		contextJava.close();

	}
}
