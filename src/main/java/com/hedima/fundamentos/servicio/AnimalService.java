package com.hedima.fundamentos.servicio;

import com.hedima.fundamentos.modelo.ejercicio2.Animal;
import com.hedima.fundamentos.modelo.repositorio.IAnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService implements IAnimalService{
    @Autowired
    private IAnimalRepo repo;
    @Override
    public Animal crear(Animal a) {
        return repo.save(a);
    }

    @Override
    public List<Animal> consultarTodos() {
        return repo.findAll();
    }
}
