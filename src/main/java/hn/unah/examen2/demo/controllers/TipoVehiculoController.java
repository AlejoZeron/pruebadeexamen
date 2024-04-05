package hn.unah.examen2.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.demo.entities.TipoVehiculo;
import hn.unah.examen2.demo.services.Impl.TipoVehiculoServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class TipoVehiculoController {

    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping("/tipoVehiculo/crear")
    public TipoVehiculo creaTipoVehiculo(@RequestBody TipoVehiculo TipoVehiculo){
        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(TipoVehiculo);
    }
    
}
