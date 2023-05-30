package com.hedima.fundamentos.servicio;

import com.hedima.fundamentos.modelo.ejercicio2.Animal;

import java.util.List;

public interface IAnimalService {
    Animal crear(Animal a);
    List<Animal> consultarTodos();
}
