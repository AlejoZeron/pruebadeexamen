package hn.unah.examen2.demo.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.demo.entities.Vehiculos;
import hn.unah.examen2.demo.repositires.VehiculosRepository;
import hn.unah.examen2.demo.services.VehiculosService;


@Service
public class VehiculosServiceImpl implements VehiculosService {


    @Autowired
    private VehiculosRepository vehiculorepository;

    @Override
    public Vehiculos crearVehiculo(Vehiculos vehiculos) {
        return this.vehiculorepository.save(vehiculos);
    }

    @Override
    public List<Vehiculos> obtenerVehiculos() {
        return (List<Vehiculos>) this.vehiculorepository.findAll();
    }

    @Override
    public Vehiculos obtenerVehiculoId(Integer idVehiculo) {
        return this.vehiculorepository.findById(idVehiculo).get();
    }

}
