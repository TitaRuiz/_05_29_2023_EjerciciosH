package com.hedima.fundamentos.servicio;

import com.hedima.fundamentos.modelo.ejercicio2.Zoo;
import com.hedima.fundamentos.modelo.repositorio.IZooRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZooService implements IZooService{
    @Autowired
    private IZooRepo repo;
    @Override
    public Zoo obtenerUno(int i) {
        return repo.findById(i).orElse(new Zoo());
    }
}
