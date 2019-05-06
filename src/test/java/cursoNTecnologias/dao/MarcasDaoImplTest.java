package cursoNTecnologias.dao;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.bd.MarcasDao.MarcasDao;
import cursoNTecnologias.bd.domain.Marcas;
import jdk.nashorn.internal.ir.annotations.Ignore;;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class MarcasDaoImplTest{
	@Inject
	MarcasDao marcasDao;
	
	
	public void marcaId() {
		try {
			System.out.println(" \nTest consultar una marca por id");
			marcasDao.obtenerMarcaId(1);	
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	@Test
	public void obtenerTodasMarca() {
		try {
			System.out.println("\nTest consultar Todas las marcas");
			marcasDao.obtenerTodasMarca();	
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	public void deleteMarca() {
		try{
			System.out.println("Eliminando un Marca por id");
			marcasDao.deleteMarca(6);	
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	
	public void agregaMarca(){
		try{
			System.out.println("\nAgregando una nueva marca");
			Marcas marca = new Marcas();
			marca.setIdmarca(0);
			marca.setNombremarca("HP");
			
			marcasDao.agregarMarca(marca);
			
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	public void updateMarca() {
		System.out.println("\nActualizando una marca");
		Marcas marca = new Marcas();
		marca.setIdmarca(3);
		marca.setNombremarca("Realteck");
		marcasDao.updateMarca(marca);
	}
	
}
