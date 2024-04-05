package hn.unah.examen2.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2.demo.entities.Vehiculos;
import hn.unah.examen2.demo.services.Impl.VehiculosServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class VehiculosController {
    

    @Autowired
    private VehiculosServiceImpl vehiculosServiceImpl;

    @PostMapping("/vehiculo/crear")
    public Vehiculos crearVehiculo(@RequestBody Vehiculos vehiculos){
        return this.vehiculosServiceImpl.crearVehiculo(vehiculos);
    }

    @GetMapping("/vehiculo/obtener")
    public List<Vehiculos> obetenerVehiculos(){
        return this.vehiculosServiceImpl.obtenerVehiculos();
    }

    @GetMapping("/vehiculo/obtenerPorId")
    public Vehiculos obtenerVehiculoId(@RequestParam Integer idCliente) {
        return this.vehiculosServiceImpl.obtenerVehiculoId(idCliente);
    }
}
