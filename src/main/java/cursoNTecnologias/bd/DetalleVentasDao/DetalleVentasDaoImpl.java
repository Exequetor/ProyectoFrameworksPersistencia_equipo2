package cursoNTecnologias.bd.DetalleVentasDao;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoNTecnologias.bd.domain.DetalleVentas;
import cursoNTecnologias.bd.mappers.DetalleVentasMapper;

@Named
public class DetalleVentasDaoImpl implements DetalleVentasDao {

	SqlSession sqlSession;
	@Autowired
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession= sqlSession;
	}
	
	public void insertarDetalleVentas(DetalleVentas dventas) {
		try {
			DetalleVentasMapper detalleVentasMapper = sqlSession.getMapper(DetalleVentasMapper.class);
			detalleVentasMapper.insertarDetalleVentas(dventas);
			//System.out.println("Id: " + cliente.getId());
			System.out.println("idVenta: " + dventas.getVentaid());
			System.out.println("productoId: " + dventas.getProductoid());
			System.out.println("Cantidad: " + dventas.getCantidad());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

}
