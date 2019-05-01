package cursoNTecnologias.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.bd.ClienteDao.ClienteDao;
import cursoNTecnologias.bd.domain.Cliente;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class ClienteDaoImplTest {
	
	@Inject
	ClienteDao clienteDao;

	@Test
	public void pruebaConsultarTodo() {
		try {
			System.out.println("Test consultar todos los clientes");
			clienteDao.listarTodosClientes();
			//assertEquals(lista.size(),7);
			System.out.println("\nTest consultar todos los clientes direccion");
			clienteDao.listarTodosClientesDireccion();
			//System.out.println("Test consultar 1 cliente");
			System.out.println("\nConsultar el cliente y su dirección con ID = 1");
			clienteDao.clienteDireccion(1);
			
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
}
