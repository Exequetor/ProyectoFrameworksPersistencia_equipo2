package cursoNTecnologias.bd.VentasDao;

import java.util.List;

import cursoNTecnologias.bd.domain.Productos;
import cursoNTecnologias.bd.domain.Ventas;

public interface VentasDao {
	/**
	 * Consultas
	 */
	public List<Ventas> queryAllVentas();
	public List<Ventas> queryVentasByVentaId(Integer id);
	public List<Ventas> queryVentasByClienteId(Integer id);
	
	/**
	 * Insert
	 */
	public void insertVenta(Integer idCliente, List<Productos> productos);
	
	/**
	 * Update
	 */
	public void updateVentas(Ventas ventas);
	
	/**
	 * Delete
	 */
	public void deleteVentasByVentasId(Integer ventasId);
}
