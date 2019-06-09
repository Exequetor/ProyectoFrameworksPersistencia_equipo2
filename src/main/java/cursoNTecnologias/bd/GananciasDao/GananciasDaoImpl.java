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
	
	/**
	 * Consultas
	 */
	public List<Ganancias> queryAllGanancias() {
		List<Ganancias> list = null;
		try {
			GananciasMapper gm = sqlSession.getMapper(GananciasMapper.class);
			list = gm.queryAllGanancias();
			System.out.println("\nqueryAllGanancias\n");
			for (Ganancias g : list) {
				System.out.println(g);
			}
		} catch (Exception e) {
			System.out.println("Error en GananciasDaoImpl");
			e.printStackTrace();
		}
		return list;
		
	}

	public List<Ganancias> queryGananciasByVentaId() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Insert
	 */
	public void insertGanancia(Ganancias ganancias) {
		try {
			GananciasMapper gananciasMapper = sqlSession.getMapper(GananciasMapper.class);
			gananciasMapper.insertGanancia(ganancias);
			//System.out.println("Id: " + cliente.getId());
			System.out.println("idVenta: " + ganancias.getVentaid());
			System.out.println("Total ganancia: " + ganancias.getTotalganancia());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
	/**
	 * Update
	 */
	public void updateGanancia(Ganancias ganancia) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Delete
	 */
	public void deleteGanancia (Integer gananciaId) {
		// TODO Auto-generated method stub
		
	}

}
