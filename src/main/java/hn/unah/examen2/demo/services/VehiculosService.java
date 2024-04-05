package hn.unah.examen2.demo.services;

import java.util.List;


import hn.unah.examen2.demo.entities.Vehiculos;

public interface VehiculosService{

    public Vehiculos crearVehiculo(Vehiculos vehiculos);

    public List<Vehiculos> obtenerVehiculos();

    public Vehiculos obtenerVehiculoId(Integer idVehiculo);
}
