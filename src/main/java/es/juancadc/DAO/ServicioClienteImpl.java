package es.juancadc.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
@Component
public class ServicioClienteImpl implements ServicioCliente {

	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void insertarCliente(ClienteDAO nuevoCliente) {
		em.persist(nuevoCliente);

	}

}
