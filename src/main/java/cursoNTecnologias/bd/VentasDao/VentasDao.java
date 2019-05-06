package cursoNTecnologias.bd.VentasDao;

import java.util.List;

import cursoNTecnologias.bd.domain.Productos;
import cursoNTecnologias.bd.domain.Ventas;

public interface VentasDao {
	List<Ventas> listarTodasVentas();
	Ventas ventaClienteById();
	void insertVenta(Integer idCliente, List<Productos> productos);
	
}
