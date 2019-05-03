package cursoNTecnologias.bd.mappers;
import cursoNTecnologias.bd.domain.Direccion;

import java.util.List;

public interface DireccionMapper {
	List <DireccionMapper> listarDireccion ();
	Direccion direccionId(Integer id); 
}
