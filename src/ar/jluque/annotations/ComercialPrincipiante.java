package ar.jluque.annotations;

import org.springframework.stereotype.Component;

@Component
public class ComercialPrincipiante  implements Empleados{

	@Override
	public String getTareas() {
		return "Tareas: Ofrecer folleteria";
	}

	@Override
	public String getInformes() {
		return "Informes: Cantidad folletos entregados, cantidad de clientes nuevos";
	}

}
