package cursoNTecnologias.bd.VentasDao;

import java.util.List;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoNTecnologias.bd.domain.Ventas;
import cursoNTecnologias.bd.mappers.DetalleVentasMapper;
import cursoNTecnologias.bd.mappers.VentasMapper;

@Named
public class VentasDaoImpl implements VentasDao {

	SqlSession sqlSession;
	@Autowired
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession= sqlSession;
	}
	
	public List<Ventas> listarTodasVentas() {
		// TODO Auto-generated method stub
		return null;
	}

	public Ventas ventaClienteById() {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertarVenta(Ventas venta) {
		try {
			VentasMapper ventaMapper = sqlSession.getMapper(VentasMapper.class);
			ventaMapper.insertVenta(venta);
			//System.out.println("Id: " + cliente.getId());
			System.out.println("clienteId: " + venta.getClienteid());
			System.out.println("totalVenta: " + venta.getTotalventa());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	public void insertarVenta() {
		// TODO Auto-generated method stub
		
	}

}
