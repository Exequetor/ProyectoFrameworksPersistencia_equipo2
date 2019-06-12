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
	public void insertGanancia(Ganancias ganancia);
	
	/**
	 * Update
	 */
	public void updateGanancia(Ganancias ganancia);
	
	/**
	 * Delete
	 */
	public void deleteGanancia(Integer gananciaId);
}
