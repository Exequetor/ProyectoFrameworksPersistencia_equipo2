package cursoNTecnologias.bd.mappers;

import java.util.List;

import cursoNTecnologias.bd.domain.Marcas;

public interface MarcasMapper {
	Marcas obtenerMarcaId(Integer id);
	List <Marcas> obtenerTodasMarca();
	void agregarMarca(Marcas m);
	void deleteMarca(Integer id);
	void updateMarca(Marcas m);
}
