package cursoNTecnologias.bd.mappers;
import cursoNTecnologias.bd.domain.Direccion;

import java.util.List;
import java.util.Map;

public interface DireccionMapper {
	List <Direccion> listarDireccion ();
	Direccion direccionId(Integer id);
	void insertarDireccion(Direccion direccion);
	void eliminarDireccion(Integer id);
	void actualizarDireccion(Direccion direccion);
	Direccion obtenerDireccionPorId(Map<String, Integer> mapDireccion);
}
