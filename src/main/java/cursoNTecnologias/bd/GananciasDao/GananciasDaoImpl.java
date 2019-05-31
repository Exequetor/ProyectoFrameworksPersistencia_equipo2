package cursoNTecnologias.bd.GananciasDao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoNTecnologias.bd.domain.Ganancias;
import cursoNTecnologias.bd.mappers.GananciasMapper;

@Named
public class GananciasDaoImpl implements GananciasDao, Serializable {

	private static final long serialVersionUID = -7305475619834562523L;
	
	SqlSession sqlSession;
	@Autowired
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession= sqlSession;
	}

	public List<Ganancias> queryAllGanancias() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Ganancias> queryGananciasByVentaId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void insertGanancias(Ganancias ganancias) {
		try {
			GananciasMapper gananciasMapper = sqlSession.getMapper(GananciasMapper.class);
			gananciasMapper.insertGanancias(ganancias);
			//System.out.println("Id: " + cliente.getId());
			System.out.println("idVenta: " + ganancias.getVentaid());
			System.out.println("Total ganancia: " + ganancias.getTotalganancia());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
	public void updateGanancias(Ganancias ganancia) {
		// TODO Auto-generated method stub
		
	}

	public void deleteGananciasByGananciasId(Integer gananciaId) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Consultas
	 */
	
	/**
	 * Insert
	 */
	
	/**
	 * Update
	 */
	
	/**
	 * Delete
	 */

}
