package es.juancadc.Consultas;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.juancadc.DAO.ClienteDAO;
import es.juancadc.DAO.ServicioClienteImpl;

@Component
public class Consultas {

	@Autowired
	private ServicioClienteImpl sci;
	
	@Transactional
	public void insertarCliente(ClienteDAO cliente) {
		sci.insertarCliente(cliente);
	}
	
}
