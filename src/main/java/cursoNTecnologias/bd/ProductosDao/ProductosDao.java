package cursoNTecnologias.bd.ProductosDao;

import java.util.List;

import cursoNTecnologias.bd.domain.Cliente;
import cursoNTecnologias.bd.domain.Productos;

public interface ProductosDao {
	List <Productos> listarProductos ();
	void agregarProducto(Productos p);
	Productos listarUnProducto(Productos p);
	void updateProducto(Productos p);
	void deleteProducto(Integer id);
	
	List<Productos> listarTodosProductosMarca();
	Productos productoMarca(Integer id);
}
