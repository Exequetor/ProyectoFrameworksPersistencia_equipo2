package cursoNTecnologias.dao;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.bd.DireccionDao.DireccionDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")

public class DireccionDaoImplTest {
	@Inject
	DireccionDao direccionDao;
	
	@Test
	public void pruebaConsultarTodo() {
		try {
			System.out.println("Test consultar la dirección del cliente");
			direccionDao.direccionId(1);	
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
}
