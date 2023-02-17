package es.juancadc.ejemploWeb.web.Consultas;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import es.juancadc.ejemploWeb.aplicacion.DAO.ClienteDAO;
import es.juancadc.ejemploWeb.aplicacion.DAO.ServicioCliente;


@Service
public class Consultas {

	@Autowired
	private ServicioCliente sc;
	
	
	public void insertarCliente(ClienteDAO clienteDAO) {
         
		sc.save(clienteDAO);
		
        
    }
	
}
