package cursoNTecnologias.bd.mappers;

import java.util.List;

import cursoNTecnologias.bd.domain.Ventas;

public interface VentasMapper {
	/**
	 * Consultas
	 */
	public List<Ventas> queryAllVentas();
	public List<Ventas> queryVentasByVentaId(Integer id);
	public List<Ventas> queryVentasByClienteId(Integer id);
	
	/**
	 * Insert
	 */
	public void insertVenta(Ventas venta);
	
	/**
	 * Update
	 */
	public void updateVenta(Ventas venta);
	
	/**
	 * Delete
	 */
	public void deleteVenta(Integer id);
}
