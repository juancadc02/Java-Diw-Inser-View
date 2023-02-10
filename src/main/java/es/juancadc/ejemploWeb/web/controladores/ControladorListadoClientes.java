package es.juancadc.ejemploWeb.web.controladores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.juancadc.DTO.Cliente;

/**
 * Servlet implementation class ControladorListadoClientes
 */
//@WebServlet("/ControladorListadoClientes")
@Controller
public class ControladorListadoClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@RequestMapping(value="/listadoDeClientes")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispacher = request.getRequestDispatcher("/listarLosClientes");
		dispacher.forward(request, response);
	}


	@RequestMapping(value="/listarLosClientes")
	 public ModelAndView gestionSolicitud() {

		Map<String, Object> miModelo = new HashMap<String,Object>(); 
		List<Cliente> listadoClientes= new ArrayList<>();
		Cliente cliente1= new Cliente(1, "Juan Carlos", "Dorado Castro", 746574635,"36473647S");
		listadoClientes.add(cliente1);
		miModelo.put("listadoCliente", listadoClientes);
		
		 return new ModelAndView("listadoCliente","miModelo",miModelo); 
	}
}
