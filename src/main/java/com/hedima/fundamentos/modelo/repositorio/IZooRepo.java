package com.hedima.fundamentos.modelo.repositorio;

import com.hedima.fundamentos.modelo.ejercicio2.Zoo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IZooRepo extends JpaRepository<Zoo,Integer> {
}
