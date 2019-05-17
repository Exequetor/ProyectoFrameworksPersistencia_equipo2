package cursoNTecnologias.bd.mappers;

import java.util.List;

import cursoNTecnologias.bd.domain.Ventas;

public interface VentasMapper {
	/**
	 * Consultas
	 */
	public List<Ventas> queryAllVentas();
	public List<Ventas> queryVentasByVentaId();
	public List<Ventas> queryVentasByClienteId();
	
	/**
	 * Insert
	 */
	public void insertVenta(Ventas venta);
	
	/**
	 * Update
	 */
	public void updateVentas(Ventas ventas);
	
	/**
	 * Delete
	 */
	public void deleteVentasByVentasId(Integer ventasId);
}
