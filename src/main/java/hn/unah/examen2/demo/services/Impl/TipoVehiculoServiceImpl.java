package hn.unah.examen2.demo.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2.demo.entities.TipoVehiculo;
import hn.unah.examen2.demo.repositires.TipoVehiculoRepository;
import hn.unah.examen2.demo.services.TipoVehiculoService;

@Service  
public class TipoVehiculoServiceImpl implements TipoVehiculoService{

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return this.tipoVehiculoRepository.save(tipoVehiculo);
    }
    
}
