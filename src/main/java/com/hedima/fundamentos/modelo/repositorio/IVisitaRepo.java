package com.hedima.fundamentos.modelo.repositorio;

import com.hedima.fundamentos.modelo.ejercicio1.Visita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVisitaRepo extends JpaRepository<Visita,Integer> {
}
