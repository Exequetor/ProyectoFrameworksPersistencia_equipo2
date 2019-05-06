package cursoNTecnologias.bd.mappers;


import cursoNTecnologias.bd.domain.DetalleVentas;

public interface DetalleVentasMapper {
	DetalleVentas listarDetalleVentasByIdVenta ();
	void insertarDetalleVentas(DetalleVentas dventas);
}
