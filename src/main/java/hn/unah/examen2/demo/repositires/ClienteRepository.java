package hn.unah.examen2.demo.repositires;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.examen2.demo.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{

    
} 
