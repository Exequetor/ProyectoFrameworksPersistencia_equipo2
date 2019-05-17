package cursoNTecnologias.bd.GananciasDao;

import java.util.List;

import cursoNTecnologias.bd.domain.Ganancias;

public interface GananciasDao {
	/**
	 * Consultas
	 */
	public List<Ganancias> queryAllGanancias();
	public List<Ganancias> queryGananciasByVentaId();
	
	/**
	 * Insert
	 */
	public void insertGanancias(Ganancias ganancia);
	
	/**
	 * Update
	 */
	public void updateGanancias(Ganancias ganancia);
	
	/**
	 * Delete
	 */
	public void deleteGananciasByGananciasId(Integer gananciaId);
}
