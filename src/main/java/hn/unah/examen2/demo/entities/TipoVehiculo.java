package hn.unah.examen2.demo.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="tipovehiculo")
@Data
public class TipoVehiculo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idtipovehiculo")
    private int idTipoVehiculo;

    private char descripcion;

    @Column(name = "precioxhora")
    private double precioXHora;

    @OneToMany(mappedBy = "tipovehiculo")
    private List<Vehiculos> vehiculos;
    
}
