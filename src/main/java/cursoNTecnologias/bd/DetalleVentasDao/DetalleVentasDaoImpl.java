package cursoNTecnologias.bd.DetalleVentasDao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoNTecnologias.bd.domain.DetalleVentas;
import cursoNTecnologias.bd.mappers.DetalleVentasMapper;

@Named
public class DetalleVentasDaoImpl implements DetalleVentasDao, Serializable {

	private static final long serialVersionUID = 2417853124509231083L;
	SqlSession sqlSession;
	@Autowired
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession= sqlSession;
	}
	
	@Override
	public List<DetalleVentas> queryAllDetalleVentasProductos() {
		List<DetalleVentas> list = null;
		try {
			DetalleVentasMapper dvMapper = sqlSession.getMapper(DetalleVentasMapper.class);
			list = dvMapper.queryAllDetalleVentasProductos();
			System.out.println("Cantidad de registros en detalle ventas: " + list.size());
			for (DetalleVentas dv : list) {
				System.out.println("ventaId = " + dv.getVentaid());
				System.out.println("Nombre del producto = " + dv.getProducto().getNombre());
				System.out.println("Cantidad = " + dv.getCantidad());
			}
		} catch (Exception e) {
			System.out.println("Error en DetalleVentasDaoImpl->queryAllDetalleVentas");
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<DetalleVentas> queryDetalleVentasProductosByVentaId(Integer id) {
		List<DetalleVentas> list = null;
		try {
			DetalleVentasMapper dvMapper = sqlSession.getMapper(DetalleVentasMapper.class);
			list = dvMapper.queryDetalleVentasProductosByVentaId(id);
			System.out.println("Cantidad de registros en detalle ventas: " + list.size());
			for (DetalleVentas dv : list) {
				System.out.println("ventaId = " + dv.getVentaid());
				System.out.println("Nombre del producto = " + dv.getProducto().getNombre());
				System.out.println("Cantidad = " + dv.getCantidad());
			}
			return list;
		} catch (Exception e) {
			System.out.println("Error en DetalleVentasDaoImpl->queryDetalleVentasByVentaId");
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public void insertDetalleVentas(DetalleVentas dventas) {
		try {
			DetalleVentasMapper detalleVentasMapper = sqlSession.getMapper(DetalleVentasMapper.class);
			detalleVentasMapper.insertDetalleVentas(dventas);
			//System.out.println("Id: " + cliente.getId());
			System.out.println("idVenta: " + dventas.getVentaid());
			System.out.println("productoId: " + dventas.getProductoid());
			System.out.println("Cantidad: " + dventas.getCantidad());
		} catch (Exception e) {
			System.out.println("Error en DetalleVentasDaoImpl->insertDetalleVentas()");
			e.printStackTrace();
		}
	}

	@Override
	public void updateDetalleVentas(DetalleVentas dventas) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error en DetalleVentasDaoImpl->updateDetalleVentas");
			e.printStackTrace();
		}
	}

	@Override
	public void deleteDetalleVentasByVentasId(Integer ventasId) {
		try {
			
		} catch (Exception e) {
			System.out.println("Error en DetalleVentasDaoImpl->deleteDetalleVentasByVentasId");
			e.printStackTrace();
		}
	}

}
