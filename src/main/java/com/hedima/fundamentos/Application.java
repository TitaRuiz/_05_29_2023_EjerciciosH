package com.hedima.fundamentos;

import com.hedima.fundamentos.modelo.ejercicio1.Autobus;
import com.hedima.fundamentos.modelo.ejercicio1.Conductor;
import com.hedima.fundamentos.modelo.ejercicio1.Lugar;
import com.hedima.fundamentos.modelo.ejercicio1.Visita;
import com.hedima.fundamentos.servicio.IVisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private IVisitaService servicio;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Autobus a1 = new Autobus("9234LMK",2023);
        Conductor c1 = new Conductor("923456789A","Juan López");
        Lugar l1 = new Lugar("Segovia");
        Visita v1 = new Visita(LocalDate.now(),a1,l1,c1);
        servicio.crear(v1);


    }
}
