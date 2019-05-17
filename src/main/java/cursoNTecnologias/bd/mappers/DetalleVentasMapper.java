package cursoNTecnologias.bd.mappers;


import java.util.List;

import cursoNTecnologias.bd.domain.DetalleVentas;

public interface DetalleVentasMapper {
	/**
	 * Consultas
	 */
	public List<DetalleVentas> queryAllDetalleVentasProductos();
	public List<DetalleVentas> queryDetalleVentasProductosByVentaId(Integer id);
	
	/**
	 * Insert
	 */
	public void insertDetalleVentas(DetalleVentas dventas);
	
	/**
	 * Update
	 */
	public void updateDetalleVentas(DetalleVentas dventas);
	
	/**
	 * Delete
	 */
	public void deleteDetalleVentasByVentasId(Integer ventasId);
}
