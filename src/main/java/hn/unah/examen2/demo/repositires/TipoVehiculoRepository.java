package hn.unah.examen2.demo.repositires;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.examen2.demo.entities.TipoVehiculo;


@Repository
public interface TipoVehiculoRepository extends CrudRepository<TipoVehiculo, Integer>{
    
}
