package hn.unah.examen2.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.demo.entities.TipoCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import hn.unah.examen2.demo.services.Impl.TipoClienteServiceImpl;


@RestController
@RequestMapping("/api")
public class TipoClienteController {

    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/tipoCliente/crear")
    public TipoCliente crearTipoCliente(@RequestBody TipoCliente tipoCliente) {
        return this.tipoClienteServiceImpl.crearTipoCliente(tipoCliente);

    }
    
    
}
