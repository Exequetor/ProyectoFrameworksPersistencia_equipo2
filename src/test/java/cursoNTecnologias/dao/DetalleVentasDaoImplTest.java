package cursoNTecnologias.dao;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.bd.DetalleVentasDao.DetalleVentasDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class DetalleVentasDaoImplTest {
	@Inject
	DetalleVentasDao detalleVentasDao;
	
	@Test
	public void testConsultas() {
		try {
			System.out.println("*** Test de consultas para DetalleVentas");
			System.out.println("* Test 1: consultar todos los registros de DetalleVentas");
			detalleVentasDao.queryAllDetalleVentasProductos();
			
			//System.out.println("* Test 2: consultar producto por id venta");
			//detalleVentasDao.queryDetalleVentasProductosByVentaId(1);
			
		} catch (Exception e) {
			System.out.println("Error en test: DetalleVentas->testConsultas");
			e.printStackTrace();
		}
	}
}
