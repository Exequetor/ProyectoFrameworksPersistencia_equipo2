package cursoNTecnologias.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.bd.ProductosDao.ProductosDao;
import cursoNTecnologias.bd.VentasDao.VentasDao;
import cursoNTecnologias.bd.domain.Productos;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class VentaDaoImplTest {
	@Inject
	VentasDao ventasDao;
	@Inject
	ProductosDao productosDao;
	
	@Test
	public void insertVenta (){
		System.out.println("\nTest: insertar nueva venta.");
		try{
			System.out.println("\nGenerando productos aleatorios.");
			int randomNumber;
			Productos producto;
			List<Productos> listaProductos = new ArrayList <Productos>();
			List<Productos> queryProductos = productosDao.listarProductos();
			for (Productos prod : queryProductos) {
				randomNumber = (int) (Math.random() * 15) + 1;
				if (randomNumber > 10) {
					producto = new Productos ();
					producto.setIdproducto(prod.getIdproducto());
					producto.setMarcaid(prod.getMarcaid());
					producto.setNombre(prod.getNombre());
					producto.setPrecio(prod.getPrecio());
					producto.setPreciovta(prod.getPreciovta());
					producto.setCantidad(randomNumber - 10);
					listaProductos.add(producto);
				}
			}
			ventasDao.insertVenta(1, listaProductos);
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
}
