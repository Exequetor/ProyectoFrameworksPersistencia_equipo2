package cursoNTecnologias.dao;

import static org.junit.Assert.*;
import java.util.List;
import javax.inject.Inject;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.bd.ProductosDao.ProductosDao;
import cursoNTecnologias.bd.domain.Cliente;
import cursoNTecnologias.bd.domain.Productos;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class ProductosDaoImplTest {
	@Inject
	ProductosDao productosDao;
	
	public void listarTodosProductos() {
		try {
			System.out.println("Test consultar todos los productos");
			productosDao.listarProductos();
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	@Test
	public void listarTodosProductosMarca() {
		try {
			System.out.println("\nTest consultar todos los productos con su marca");
			productosDao.listarTodosProductosMarca();
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	public void productoMarca() {
		try {
			System.out.println("Test consultar unsolo producto con su marca");
			productosDao.productoMarca(1);
		} catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	public void updateProducto(){
		System.out.println("Actualizando un producto.");
		try{
			Productos producto=new Productos();
			producto.setIdproducto(1);
			producto.setNombre("iPhone XS");
			producto.setPrecio(25000.0);
			producto.setPreciovta(32000.0);
			producto.setCantidad(1);
			producto.setMarcaid(1);
			productosDao.updateProducto(producto);
			
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	public void deleteProducto() {
		try{
			System.out.println("Eliminando un producto por id");
			productosDao.deleteProducto(3);	
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
	public void agregaProductoNuevo(){
		try{
			System.out.println("Agregando un nuevo producto");
			Productos producto = new Productos();
			producto.setNombre("Smartwatch");
			producto.setPrecio(3500.0);
			producto.setPreciovta(4000.0);
			producto.setMarcaid(4);
			producto.setCantidad(10);
			
			productosDao.agregarProducto(producto);
			
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex);
		}
	}
	
}
