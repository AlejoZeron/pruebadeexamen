package hn.unah.examen2.demo.services;

import java.util.List;

import hn.unah.examen2.demo.entities.Cliente;

public interface ClienteService {
    
    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerClientes();

    public Cliente obtenClientePorId(Integer idCliente);

}
