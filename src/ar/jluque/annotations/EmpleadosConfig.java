package ar.jluque.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ar.jluque.annotations")
public class EmpleadosConfig {

	/**
	 * Definimos el bean para la clase: InformeFinancieroCompras 
	 */
	@Bean
	public InformeFinancieroCompras informeFinancieroCompras() {
		return new InformeFinancieroCompras();
	}
	
	/**
	 * Definimos el bean para la clase: DirectorFinanciero
	 */
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroCompras());
	}
}
