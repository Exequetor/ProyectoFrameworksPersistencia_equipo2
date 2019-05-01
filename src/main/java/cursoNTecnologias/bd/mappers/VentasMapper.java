package cursoNTecnologias.bd.mappers;

import java.util.List;

import cursoNTecnologias.bd.domain.Ventas;

public interface VentasMapper {
	List <VentasMapper> listarVentas ();
	Ventas consultarVenta ();
}
