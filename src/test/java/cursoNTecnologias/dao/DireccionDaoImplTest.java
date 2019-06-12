package cursoNTecnologias.dao;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.bd.DireccionDao.DireccionDao;
import cursoNTecnologias.bd.domain.Cliente;
import cursoNTecnologias.bd.domain.Direccion;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")

public class DireccionDaoImplTest {
	@Inject
	DireccionDao direccionDao;
	
	@Ignore
	public void pruebaConsultarTodo() {
		try {
			System.out.println("Test consultar la dirección del cliente");
			direccionDao.direccionId(1);	
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	@Ignore
	public void insertarDireccion(){
		try{
			
			Direccion direccion = new Direccion();
			direccion.setCalle("Constitucion");
			direccion.setNumero(400);
			direccion.setColonia("Acatlima");
			direccion.setCiudad("Huajuapan");
			direccion.setEstado("Oaxaca");
			direccion.setPais("Mexico");
			direccion.setCodigopostal(5000);
			
			direccionDao.insertarDireccion(direccion);
			
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	@Ignore
	public void eliminarDireccion(){
		try{
			direccionDao.eliminarDireccion(5);
			
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	@Test
	public void actualizarDireccion(){
		try{
			Direccion direccion = new Direccion();
			
			direccion.setCalle("Villa Alta");
			direccion.setNumero(100);
			direccion.setColonia("Niños Heroes");
			direccion.setCiudad("Oaxaca de Juarez");
			direccion.setEstado("Oaxaca");
			direccion.setPais("Mexico");
			direccion.setCodigopostal(6001);
			direccion.setIddireccion(1);
			direccionDao.actualizarDireccion(direccion);
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
}
