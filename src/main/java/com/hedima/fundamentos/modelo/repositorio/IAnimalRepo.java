package com.hedima.fundamentos.modelo.repositorio;

import com.hedima.fundamentos.modelo.ejercicio2.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAnimalRepo extends JpaRepository<Animal,Integer> {
}
