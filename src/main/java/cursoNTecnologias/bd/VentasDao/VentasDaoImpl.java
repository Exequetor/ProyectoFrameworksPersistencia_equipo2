package cursoNTecnologias.bd.VentasDao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoNTecnologias.bd.DetalleVentasDao.DetalleVentasDao;
import cursoNTecnologias.bd.GananciasDao.GananciasDao;
import cursoNTecnologias.bd.domain.DetalleVentas;
import cursoNTecnologias.bd.domain.Ganancias;
import cursoNTecnologias.bd.domain.Productos;
import cursoNTecnologias.bd.domain.Ventas;
import cursoNTecnologias.bd.mappers.VentasMapper;

@Named
public class VentasDaoImpl implements VentasDao, Serializable {

	private static final long serialVersionUID = -6330217361276954662L;

	SqlSession sqlSession;
	
	@Inject
	DetalleVentasDao dVentasDao;
	@Inject
	GananciasDao gananciasDao;
	
	@Autowired
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession= sqlSession;
	}
	
	public List<Ventas> queryAllVentas() {
		List<Ventas> list = null;
		try {
			VentasMapper vm = sqlSession.getMapper(VentasMapper.class);
			list = vm.queryAllVentas();
			System.out.println("\nqueryAllVentas\n");
			for(Ventas v : list) {
				System.out.println(v);
			}
			
		} catch (Exception e) {
			System.out.println("Error en VentasDaoImpl->queryAllVentas: ");
			e.printStackTrace();
		}
		return list;
	}

	public List<Ventas> queryVentasByVentaId(Integer id) {
		List<Ventas> list = null;
		try {
			VentasMapper vm = sqlSession.getMapper(VentasMapper.class);
			list = vm.queryVentasByVentaId(id);
			System.out.println("\nqueryVentasByVentaId\n");
			for(Ventas v : list) {
				System.out.println(v);
			}
			
		} catch (Exception e) {
			System.out.println("Error en VentasDaoImpl->queryVentasByVentaId: ");
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Ventas> queryVentasByClienteId(Integer id) {
		List<Ventas> list = null;
		try {
			VentasMapper vm = sqlSession.getMapper(VentasMapper.class);
			list = vm.queryVentasByClienteId(id);
			System.out.println("\nqueryVentasByClienteId\n");
			for(Ventas v : list) {
				System.out.println(v);
			}
			
		} catch (Exception e) {
			System.out.println("Error en VentasDaoImpl->queryVentasByClienteId: ");
			e.printStackTrace();
		}
		return list;
	}

	public void insertVenta(Integer idCliente, List<Productos> productos) {
		try {
			double totalPrecio = 0;
			double totalVenta = 0;
			if (productos.size() == 0) {
				System.out.println("No se encontraron productos. No se agregará ningún registro.");
				return;
			}
			/*
			 * Debido a que ganancias y detalle ventas dependen del ID de
			 * la venta entonces hay que agregar primero la venta, así podremos
			 * recuperar el ID que nos genera la BD
			 * */
			int cantidad;
			for (Productos producto : productos) {
				cantidad = producto.getCantidad();
				if (cantidad != 0) {
					totalPrecio += producto.getPrecio()*cantidad;
					totalVenta += producto.getPreciovta()*cantidad;
				} else
					productos.remove(producto);
			}
			Ventas venta = new Ventas ();
			venta.setClienteid(idCliente);
			venta.setTotalventa(totalVenta);
			VentasMapper ventaMapper = sqlSession.getMapper(VentasMapper.class);
			ventaMapper.insertVenta(venta);
			//Este es el ID que se recupera del insert autogenerado
			int idRetornado = venta.getIdventa();
			
			/*
			 * Insertamos el registro de ganancia
			 */
			Ganancias ganancia = new Ganancias ();
			ganancia.setTotalganancia(totalVenta - totalPrecio);
			ganancia.setVentaid(idRetornado);
			gananciasDao.insertGanancia(ganancia);
			/**
			 * Insertamos todos los registros de detalle ventas.
			 */
			//DetalleVentasMapper dventasMapper = sqlSession.getMapper(DetalleVentasMapper.class);
			DetalleVentas dventas;
			for (Productos producto : productos) {
				dventas = new DetalleVentas();
				dventas.setVentaid(idRetornado);
				dventas.setProductoid(producto.getIdproducto());
				dventas.setCantidad(producto.getCantidad());
				dVentasDao.insertDetalleVentas(dventas);
			}
			
			System.out.println("\nidVenta generado: " + venta.getIdventa());
			System.out.println("clienteId: " + venta.getClienteid());
			System.out.println("totalVenta: " + venta.getTotalventa());
			System.out.println("totalPrecio: " + totalPrecio);
			System.out.println("totalGanancia: " + (totalVenta - totalPrecio));
		} catch (Exception e) {
			System.out.println("Error en VentasDaoImpl: ");
			e.printStackTrace();
		}
	}

	public void updateVentas(Ventas venta) {
		try {
			VentasMapper vm = sqlSession.getMapper(VentasMapper.class);
			vm.updateVenta(venta);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void deleteVentasByVentasId(Integer ventaId) {
		try {
			VentasMapper vm = sqlSession.getMapper(VentasMapper.class);
			vm.deleteVenta(ventaId);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
