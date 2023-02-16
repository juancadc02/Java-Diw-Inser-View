package es.juancadc.ejemploWeb.web.controladores;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.tiles3.SpringWildcardServletTilesApplicationContext;

import es.juancadc.ejemploWeb.aplicacion.AplicacionConfiguracionContexto;


/**
 * Servlet implementation class ControladorPaginaDeInicio
 */
//@WebServlet("/ControladorPaginaDeInicio")
@Controller
public class ControladorPaginaDeInicio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@RequestMapping(value="/paginaInicio")
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		RequestDispatcher dispacher = request.getRequestDispatcher("/aa");
		dispacher.forward(request, response);
	   
	}

	
	
	@RequestMapping(value="/aa")
	 public ModelAndView gestionSolicitud() {

		 return new ModelAndView("paginaInicio"); 
	}
	
}
