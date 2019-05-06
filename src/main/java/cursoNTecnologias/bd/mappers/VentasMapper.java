package cursoNTecnologias.bd.mappers;

import java.util.List;

import cursoNTecnologias.bd.domain.Ventas;

public interface VentasMapper {
	List <VentasMapper> listarTodasVentas ();
	Ventas consultarVentaById (Integer id);
	Ventas consultarVentaByIdCliente (Integer id);
	void insertVenta (Ventas venta);
}
