package cursoNTecnologias.bd.dao.Productos;
import java.util.List;
import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoNTecnologias.bd.domain.Cliente;
import cursoNTecnologias.bd.domain.Productos;
import cursoNTecnologias.bd.mappers.ClienteMapper;

@Named
public class ProductosDaoImpl implements ProductosDao{
	SqlSession sqlSession;
	@Autowired
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession= sqlSession;
	}
	
	public void listarUnProducto(){
		try{
			
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
	}

	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void agregarProducto(Productos p) {
		// TODO Auto-generated method stub
		
	}

	public Productos listarUnProducto(Productos p) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateProducto(Productos p) {
		// TODO Auto-generated method stub
		
	}

	public void deleteProducto(Productos p) {
		// TODO Auto-generated method stub
		
	}
}
