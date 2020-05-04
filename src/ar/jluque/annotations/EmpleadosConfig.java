package ar.jluque.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ar.jluque.annotations")
public class EmpleadosConfig {

	// Definimos el bean para la clase: InformeFinancieroCompras. 
	// El nombre del metodo sera el id del bean inyectado 
	@Bean
	public Informes miInforme() {
		return new InformeFinancieroCompras();
	}
	
	// Definimos el bean para la clase: DirectorFinanciero
	// El nombre del metodo debe ser el id de la clase osea el mismo pero con minuscula
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(miInforme());
	}
}
