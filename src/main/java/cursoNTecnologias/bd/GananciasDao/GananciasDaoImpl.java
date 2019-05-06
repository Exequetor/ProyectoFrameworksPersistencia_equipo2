package cursoNTecnologias.bd.GananciasDao;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoNTecnologias.bd.domain.Ganancias;
import cursoNTecnologias.bd.mappers.GananciasMapper;

@Named
public class GananciasDaoImpl implements GananciasDao {

	SqlSession sqlSession;
	@Autowired
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession= sqlSession;
	}
	
	public void insertarGanancias(Ganancias ganancias) {
		try {
			GananciasMapper gananciasMapper = sqlSession.getMapper(GananciasMapper.class);
			gananciasMapper.insertarGanancias(ganancias);
			//System.out.println("Id: " + cliente.getId());
			System.out.println("idVenta: " + ganancias.getVentaid());
			System.out.println("Total ganancia: " + ganancias.getTotalganancia());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

}
