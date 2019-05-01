package cursoNTecnologias.bd.mappers;

import java.util.List;

import cursoNTecnologias.bd.domain.Cliente;

public interface ClienteMapper {
	List <Cliente> listarTodosClientes();
	List <Cliente> listarTodosClientesDireccion();
	Cliente clienteDireccion(Cliente id);
}
