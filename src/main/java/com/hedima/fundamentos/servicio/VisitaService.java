package com.hedima.fundamentos.servicio;

import com.hedima.fundamentos.modelo.ejercicio1.Visita;
import com.hedima.fundamentos.modelo.repositorio.IVisitaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitaService implements IVisitaService{
    @Autowired
    private IVisitaRepo repo;

    @Override
    public Visita crear(Visita v) {
        return repo.save(v);
    }
}
