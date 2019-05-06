package cursoNTecnologias.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.bd.ProductosDao.ProductosDao;
import cursoNTecnologias.bd.domain.Productos;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class VentaDaoImplTest {
	@Inject
	ProductosDao productosDao;
	
	@Test
	public void insertVenta (){
		System.out.println("Test: insertar nueva venta.");
		try{
			System.out.println("Generando productos aleatorios.");
			int randomNumber;
			Productos producto;
			List<Productos> listaProductos = new ArrayList <Productos>();
			for (int i = 1 ; i < 5 ; i++) {
				randomNumber = (int) (Math.random() * 15) + 1;
				if (randomNumber > 10) {
					producto = new Productos ();
				}
			}
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
}
