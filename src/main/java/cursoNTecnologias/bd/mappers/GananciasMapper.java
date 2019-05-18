package cursoNTecnologias.bd.mappers;

import java.util.List;

import cursoNTecnologias.bd.domain.Ganancias;

public interface GananciasMapper {
	/**
	 * Consultas
	 */
	public List<Ganancias> queryAllGanancias();
	public List<Ganancias> queryGananciasByVentaId(Integer ventaId);
	
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
