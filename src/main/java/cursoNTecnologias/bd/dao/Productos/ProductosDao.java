package cursoNTecnologias.bd.dao.Productos;

import java.util.List;
import cursoNTecnologias.bd.domain.Productos;

public interface ProductosDao {
	List <Productos> listarProductos ();
	void agregarProducto(Productos p);
	Productos listarUnProducto(Productos p);
	void updateProducto(Productos p);
	void deleteProducto(Productos p);
}
