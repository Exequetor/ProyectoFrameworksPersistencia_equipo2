package cursoNTecnologias.bd.mappers;

import java.util.List;

import cursoNTecnologias.bd.domain.Ganancias;

public interface GananciasMapper {
	/**
	 * Consultas
	 */
	public List<Ganancias> queryAllGanancias();
	public List<Ganancias> queryGananciaByVentaId(Integer ventaId);
	
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
	public void deleteGanancia (Integer gananciaId);
}
