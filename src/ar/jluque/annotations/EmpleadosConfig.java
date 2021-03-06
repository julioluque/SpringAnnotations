package ar.jluque.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ar.jluque.annotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

	// Definimos el bean para la clase: InformeFinancieroCompras.
	// El nombre del metodo sera el id del bean inyectado
	@Bean
	public Informes miInforme() {
		return new InformeFinancieroCompras();
	}

	// Definimos el bean para la clase: DirectorFinanciero
	// El nombre del metodo debe ser el mismo id de la clase con minuscula
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(miInforme());
	}
}
