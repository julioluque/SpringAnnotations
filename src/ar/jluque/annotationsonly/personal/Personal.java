package ar.jluque.annotationsonly.personal;

import org.springframework.stereotype.Component;

@Component
public interface Personal {

	public String getTareas();

	public String getPresentacion();
}
