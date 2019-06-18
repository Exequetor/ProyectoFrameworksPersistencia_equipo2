package cursoNTecnologias.dao;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoNTecnologias.bd.DetalleVentasDao.DetalleVentasDao;
import cursoNTecnologias.bd.domain.DetalleVentas;
import cursoNTecnologias.utils.Utils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class DetalleVentasDaoImplTest {
	@Inject
	DetalleVentasDao detalleVentasDao;
	
	@Test
	public void testQueryAll() {
		try {
			System.out.println("*** Test de consultas para DetalleVentas");
			System.out.println("* Test 1: consultar todos los registros de DetalleVentas");
			detalleVentasDao.queryAllDetalleVentasProductos();
			
		} catch (Exception e) {
			System.out.println("Error en test: DetalleVentas->testConsultas");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testQueryByIdVenta() {
		try {
			List<DetalleVentas> list = detalleVentasDao.queryAllDetalleVentasProductos();
			System.out.println("\n* Test 2: consultar todos los registros de DetalleVentas de una venta");
			Integer lastId = list.get(0).getVentaid();
			if (lastId != null) {
				detalleVentasDao.queryDetalleVentasProductosByVentaId(lastId);
			} else
				System.out.println("No se encontraron registros en la tabla DetalleVentas");
			
		} catch (Exception e) {
			System.out.println("Error en test: DetalleVentas->testConsultas");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testInsert() {
		try {
			List<DetalleVentas> list = detalleVentasDao.queryAllDetalleVentasProductos();
			System.out.println("\n* Test 3: Insertar detalle venta [Duplicando algun registro]");
			DetalleVentas dventasTest = Utils.getRandomElement(list);
			if (dventasTest != null) {
				detalleVentasDao.insertDetalleVentas(dventasTest);
			} else
				System.out.println("No se encontraron registros en la tabla DetalleVentas");
			
		} catch (Exception e) {
			System.out.println("Error en test: DetalleVentas->testInsert");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testUpdate() {
		try {
			System.out.println("\n* Test 4: Actualizar registro existente");
			List<DetalleVentas> list = detalleVentasDao.queryAllDetalleVentasProductos();
			DetalleVentas dventasTest = Utils.getRandomElement(list);
			if (dventasTest != null) {
				dventasTest.setCantidad(dventasTest.getCantidad() + 5);
				detalleVentasDao.insertDetalleVentas(dventasTest);
				System.out.println("Se tenía una cantidad = " + dventasTest.getCantidad());
			} else
				System.out.println("No se encontraron registros en la tabla DetalleVentas");
			
		} catch (Exception e) {
			System.out.println("Error en test: DetalleVentas->testUpdate");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDelete() {
		try {
			System.out.println("\n* Test 5: Eliminar registros relacionados a ventasId");
			List<DetalleVentas> list = detalleVentasDao.queryAllDetalleVentasProductos();
			DetalleVentas dventasTest = Utils.getRandomElement(list);
			if (dventasTest != null) {
				detalleVentasDao.deleteDetalleVentasByVentaId(dventasTest.getVentaid());
				System.out.println("Se eliminaron los registros, ahora se tienen los siguiente registros");
				detalleVentasDao.queryAllDetalleVentasProductos();
			} else
				System.out.println("No se encontraron registros en la tabla DetalleVentas");
			
		} catch (Exception e) {
			System.out.println("Error en test: DetalleVentas->testDelete");
			e.printStackTrace();
		}
	}
}
