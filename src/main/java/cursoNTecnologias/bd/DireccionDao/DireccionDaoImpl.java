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

}
