package cursoNTecnologias.bd.ClienteDao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoNTecnologias.bd.domain.Cliente;
import cursoNTecnologias.bd.domain.Direccion;
import cursoNTecnologias.bd.mappers.ClienteMapper;
import cursoNTecnologias.bd.mappers.DireccionMapper;

@Named
public class ClienteDaoImpl implements ClienteDao, Serializable {

	private static final long serialVersionUID = -6120361141027941032L;
	SqlSession sqlSession;
	
	@Autowired
	public void setSqlSession (SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<Cliente> listarTodosClientes () {
		List<Cliente> list = null;
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			list = clienteMapper.listarTodosClientes();
			for(Cliente c:list) {
				System.out.println("Id: " + c.getId());
				System.out.println("Nombre: " + c.getNombre());
			}
			return list;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}
	
	public List<Cliente> listarTodosClientesDireccion() {
		List<Cliente> list = null;
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			list = clienteMapper.listarTodosClientesDireccion();
			for(Cliente c:list) {
				System.out.println("Id: " + c.getId());
				System.out.println("Nombre: " + c.getNombre());
				System.out.println("Calle: " + c.getDireccion().getCalle());
			}
			return list;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}
	
	public Cliente clienteDireccion(Integer id) {
		Cliente cliente = null;
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			cliente = clienteMapper.clienteDireccion(id);
			System.out.println("Id: " + cliente.getId());
			System.out.println("Nombre: " + cliente.getNombre());
			System.out.println("Calle: " + cliente.getDireccion().getCalle());
			return cliente;
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return null;
	}
	public void insertarCliente(Cliente cliente){
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.insertarCliente(cliente);
			System.out.println("Id: " + cliente.getId());
			System.out.println("Nombre: " + cliente.getNombre());
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
	}
	public void eliminarCliente(Integer id) {
		try {
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.eliminarCliente(id);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
	public void actualizarCliente(Cliente cliente){
		try{
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			clienteMapper.actualizarCliente(cliente);
		}
		catch(Exception e){
			System.out.println("Error: " + e);
		}
		
	}
	
}
