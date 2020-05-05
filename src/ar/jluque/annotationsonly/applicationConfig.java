package ar.jluque.annotationsonly;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import ar.jluque.annotationsonly.personal.Personal;
import ar.jluque.annotationsonly.personal.PersonalImpl;
import ar.jluque.annotationsonly.reportes.Reportes;
import ar.jluque.annotationsonly.reportes.ReportesImpl;

@Configuration
@ComponentScan("ar.jluque.annotationsonly")
@PropertySource("classpath:ar/jluque/annotationsonly/application.properties")
public class applicationConfig {

	@Bean
	public Reportes miReporte() {
		return new ReportesImpl();
	}
	
	@Bean
	public Personal personalImpl() {
		return new PersonalImpl(miReporte());
	}
}
