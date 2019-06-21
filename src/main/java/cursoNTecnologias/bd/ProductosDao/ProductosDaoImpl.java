package cursoNTecnologias.bd.ProductosDao;
import java.util.List;
import java.util.Map;

import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoNTecnologias.bd.domain.Cliente;
import cursoNTecnologias.bd.domain.Marcas;
import cursoNTecnologias.bd.domain.Productos;
import cursoNTecnologias.bd.mappers.ClienteMapper;
import cursoNTecnologias.bd.mappers.MarcasMapper;
import cursoNTecnologias.bd.mappers.ProductosMapper;

@Named
public class ProductosDaoImpl implements ProductosDao{
	SqlSession sqlSession;
	@Autowired
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession= sqlSession;
	}
	
	
	public List<Productos> listarTodosProductosMarca() {
		List<Productos> list = null;
		try {
			System.out.println("persistencia impl");
			ProductosMapper productoMapper = sqlSession.getMapper(ProductosMapper.class);
			list = productoMapper.listarTodosProductosMarca();
			for(Productos p:list) {
				System.out.println("\nId: "+ p.getIdproducto() );
				System.out.println("Nombre: "+ p.getNombre() );
				System.out.println("Precio: "+ p.getPrecio() );
				System.out.println("Precio venta: "+ p.getPreciovta());
				System.out.println("Cantidad: "+ p.getCantidad() );
				System.out.println("Marca: "+ p.getMarcas().getNombremarca());
			}
			return list;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	public List<Productos> listarProductos() {
		// TODO Auto-generated method stub
		List<Productos> list = null;
		try{
			ProductosMapper productosMapper = sqlSession.getMapper(ProductosMapper.class);
			list = productosMapper.listarProductos();
			for(Productos p:list){
				System.out.println("Id: "+ p.getIdproducto() );
				System.out.println("Nombre: "+ p.getNombre() );
				System.out.println("Precio: "+ p.getPrecio() );
				System.out.println("Precio venta: "+ p.getPreciovta());
				System.out.println("Cantidad: "+ p.getCantidad() );
				System.out.println("Marca: "+ p.getMarcaid());
			}
			return list;
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
		return null;
	}


	public void updateProducto(Productos p) {
		// TODO Auto-generated method stub
		try{
			ProductosMapper productoMapper = sqlSession.getMapper(ProductosMapper.class);
			productoMapper.updateProducto(p);
		}
		catch(Exception e){
			System.out.println("Error: " + e);
		}
	}

	public void deleteProducto(Integer id) {
		// TODO Auto-generated method stub
		try {
			ProductosMapper productoMapper = sqlSession.getMapper(ProductosMapper.class);
			productoMapper.deleteProducto(id);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}


	public Productos productoMarca(Integer id) {
		Productos p = null;
		try {
			ProductosMapper productoMapper = sqlSession.getMapper(ProductosMapper.class);
			p = productoMapper.productoMarca(id);
			System.out.println("Id: "+ p.getIdproducto() );
			System.out.println("Nombre: "+ p.getNombre() );
			System.out.println("Precio: "+ p.getPrecio() );
			System.out.println("Precio venta: "+ p.getPreciovta());
			System.out.println("Cantidad: "+ p.getCantidad() );
			System.out.println("Marca: "+ p.getMarcas().getNombremarca());
			return p;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}

	public void agregarProducto(Productos p,String m){
		try {
			System.out.println("\nAgregando un nuevo producto\n\t Agregando la marca");
			Marcas marca= new Marcas();
			marca.setIdmarca(1);
			marca.setNombremarca(m);
			
			MarcasMapper marcaMapper = sqlSession.getMapper(MarcasMapper.class);
			marcaMapper.agregarMarca(marca);
			
			int idRetornado= marca.getIdmarca();
			p.setMarcaid(idRetornado);
			
			System.out.println("\tAgregando datos producto");
			ProductosMapper productoMapper = sqlSession.getMapper(ProductosMapper.class);
			productoMapper.agregarProducto(p);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
	}


	public void agregarProducto(Productos p) {

		System.out.println("\tAgregando datos producto");
		ProductosMapper productoMapper = sqlSession.getMapper(ProductosMapper.class);
		productoMapper.agregarProducto(p);
	}


	public Productos listarUnProducto(Productos p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marcas obtenerMarcaPorId(Map<String, Integer> mapMarca) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Marcas obtenerMarcaPorId(Map<String, Integer> mapMarca) {
		// TODO Auto-generated method stub
		return null;
	}


}
