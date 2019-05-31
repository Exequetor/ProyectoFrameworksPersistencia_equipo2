package cursoNTecnologias.bd.DetalleVentasDao;

import java.util.List;

import cursoNTecnologias.bd.domain.DetalleVentas;

public interface DetalleVentasDao {
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
	public void deleteDetalleVentasByVentaId(Integer ventasId);
}
