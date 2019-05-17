package cursoNTecnologias.bd.mappers;
import cursoNTecnologias.bd.domain.Direccion;

import java.util.List;

public interface DireccionMapper {
	List <Direccion> listarDireccion ();
	Direccion direccionId(Integer id);
	void insertarDireccion(Direccion direccion);
	void eliminarDireccion(Integer id);
	void actualizarDireccion(Direccion direccion);
}
