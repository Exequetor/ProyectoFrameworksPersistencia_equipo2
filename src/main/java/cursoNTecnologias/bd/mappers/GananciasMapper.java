package cursoNTecnologias.bd.mappers;

import java.util.List;

import cursoNTecnologias.bd.domain.Ganancias;

public interface GananciasMapper {
	List <GananciasMapper> listarGanancias ();
	void insertarGanancias(Ganancias ganancias);
}
