package hn.unah.examen2.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.demo.entities.Cliente;
import hn.unah.examen2.demo.services.Impl.ClienteServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class ClienteController {
    
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/cliente/crear")
    public Cliente creaCliente(@RequestBody Cliente cliente){
        return this.clienteServiceImpl.crearCliente(cliente);
    }

    @GetMapping("/cliente/obtener")
    public List<Cliente> obtenerClientes(){
        return this.clienteServiceImpl.obtenerClientes();
    }

    @GetMapping("/cliente/obtenerPorId")
    public Cliente obtenClientePorId(@RequestParam Integer idCliente) {
        return this.clienteServiceImpl.obtenClientePorId(idCliente);
    }
    
    

}
