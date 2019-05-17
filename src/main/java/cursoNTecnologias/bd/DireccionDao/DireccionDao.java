package cursoNTecnologias.bd.DireccionDao;

import java.util.List;

import cursoNTecnologias.bd.domain.Direccion;
import cursoNTecnologias.bd.mappers.DireccionMapper;

public interface DireccionDao {
	List <Direccion> listarDireccion();
	Direccion direccionId(Integer id);
	void insertarDireccion(Direccion direccion);
	void eliminarDireccion(Integer id);
	void actualizarDireccion(Direccion direccion);
}
