package uia.com.api.ContabilidadUIA.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientesController {

	/**
	 * Get all Clientes
	 */
	@RequestMapping("clientes")
	public String getAllClientes() {
		System.out.println("Saludos desde getAllClientes()");
		return "Saludos desde getAllClientes()";
	}
}
