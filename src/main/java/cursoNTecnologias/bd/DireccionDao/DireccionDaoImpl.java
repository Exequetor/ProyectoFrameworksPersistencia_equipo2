package cursoNTecnologias.bd.DireccionDao;
import java.io.Serializable;
import java.util.List;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoNTecnologias.bd.domain.Cliente;
import cursoNTecnologias.bd.domain.Direccion;
import cursoNTecnologias.bd.mappers.ClienteMapper;
import cursoNTecnologias.bd.mappers.DireccionMapper;

@Named
public class DireccionDaoImpl implements DireccionDao, Serializable {
	private static final long serialVersionUID = 2457866363518496046L;
	SqlSession sqlSession;

	@Autowired
	public void setSqlSession (SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<Direccion> listarDireccion() {
		List<Direccion> list = null;
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			list = direccionMapper.listarDireccion();
			for(Direccion c:list) {
				System.out.println("Id: " + c.getIddireccion());
				System.out.println("Calle: " + c.getCalle());
				System.out.println("Código postal: " + c.getCodigopostal());
			}
			return list;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}
	
	public Direccion direccionId(Integer id) {
		Direccion direccion = null;
		try {
			DireccionMapper DireccionMapper = sqlSession.getMapper(DireccionMapper.class);
			direccion = DireccionMapper.direccionId(id);
				System.out.println("Id: " + direccion.getIddireccion());
				System.out.println("Calle: " + direccion.getCalle());
				System.out.println("#: " + direccion.getNumero());
				System.out.println("Colonia: " + direccion.getColonia());
				System.out.println("Ciudad: " + direccion.getCiudad());
				System.out.println("Estado: " + direccion.getEstado());
				System.out.println("Código Postal: " + direccion.getCodigopostal());
			return direccion;
			
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}
		
	//Insertar direccion
	public void insertarDireccion(Direccion direccion){
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			direccionMapper.insertarDireccion(direccion);
			System.out.println("Id: " + direccion.getIddireccion());
			System.out.println("Calle: " + direccion.getCalle());
			System.out.println("Numero: "+ direccion.getNumero());
			System.out.println("Colonia: " + direccion.getColonia());
			System.out.println("Estado: " + direccion.getEstado());
			System.out.println("Código postal: "+ direccion.getCodigopostal());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
	}
	
	public void eliminarDireccion(Integer id) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			direccionMapper.eliminarDireccion(id);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
	
	public void actualizarDireccion(Direccion direccion){
		try{
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			direccionMapper.actualizarDireccion(direccion);
		}
		catch(Exception e){
			System.out.println("Error: " + e);
		}
		
	}

}
