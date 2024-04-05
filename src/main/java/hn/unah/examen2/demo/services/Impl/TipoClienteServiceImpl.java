package hn.unah.examen2.demo.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.demo.entities.TipoCliente;
import hn.unah.examen2.demo.services.TipoClienteService;
import hn.unah.examen2.demo.repositires.TipoClienteRepository;


@Service
public class TipoClienteServiceImpl implements TipoClienteService{


    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(TipoCliente tipoCliente) {
        return this.tipoClienteRepository.save(tipoCliente);
    }
    
}
