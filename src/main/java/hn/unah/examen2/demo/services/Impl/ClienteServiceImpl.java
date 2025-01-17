package hn.unah.examen2.demo.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.demo.entities.Cliente;
import hn.unah.examen2.demo.repositires.ClienteRepository;
import hn.unah.examen2.demo.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Cliente obtenClientePorId(Integer idCliente) {
        return this.clienteRepository.findById(idCliente).get();
    }
    
}
