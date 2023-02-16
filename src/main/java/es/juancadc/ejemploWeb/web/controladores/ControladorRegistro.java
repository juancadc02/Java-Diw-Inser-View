package es.juancadc.ejemploWeb.web.controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.juancadc.ejemploWeb.aplicacion.DAO.ClienteDAO;
import es.juancadc.ejemploWeb.web.Consultas.Consultas;
import es.juancadc.ejemploWeb.web.DTO.Cliente;

@Controller
public class ControladorRegistro {

	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping(value="/registroDeCliente")
	public ModelAndView gestionSolicitud() {
		return new ModelAndView("añadirCliente");
	}
	

	@PostMapping(value = "/registrar")
	public ModelAndView usuarioRegistrado(@RequestParam("nombre") String nombre,
			@RequestParam("apellidos") String apellidos, 
			@RequestParam("dni") String dni) {

		// Creo el objeto cliente
		ClienteDAO nuevoCliente = new ClienteDAO(nombre, apellidos, dni);
		
		consulta.insertarCliente(nuevoCliente);
		
		List<ClienteDAO> listaClienteNuevo=new ArrayList<>();
		listaClienteNuevo.add(nuevoCliente);
		
		Map<String, Object> miModelo = new HashMap<String, Object>();
		
		
		miModelo.put("cliente", listaClienteNuevo);
		// Log para ver que se ha guardado
		logger.info("Registrado correctamente" + nuevoCliente);
		
		return new ModelAndView("registrar", "miModelo", miModelo);
	}
	

	@Autowired
	private Consultas consulta;
	
}
