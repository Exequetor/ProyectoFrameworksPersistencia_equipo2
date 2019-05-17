package cursoNTecnologias.bd.ClienteDao;

import java.util.List;

import cursoNTecnologias.bd.domain.Cliente;
import cursoNTecnologias.bd.domain.Direccion;
	

public interface ClienteDao {
	List<Cliente> listarTodosClientes();
	List<Cliente> listarTodosClientesDireccion();
	Cliente clienteDireccion(Integer id);
	void insertarCliente(Cliente cliente);
	void eliminarCliente(Integer id);
	void actualizarCliente(Cliente cliente);
}
