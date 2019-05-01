package cursoNTecnologias.bd.ClienteDao;

import java.util.List;

import cursoNTecnologias.bd.domain.Cliente;
	
public interface ClienteDao {
	List<Cliente> listarTodosClientes();
	List<Cliente> listarTodosClientesDireccion();
	Cliente clienteDireccion(Integer id);
}
