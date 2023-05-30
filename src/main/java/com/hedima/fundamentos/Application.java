package com.hedima.fundamentos;

import com.hedima.fundamentos.modelo.ejercicio1.Autobus;
import com.hedima.fundamentos.modelo.ejercicio1.Conductor;
import com.hedima.fundamentos.modelo.ejercicio1.Lugar;
import com.hedima.fundamentos.modelo.ejercicio1.Visita;
import com.hedima.fundamentos.modelo.ejercicio2.Animal;
import com.hedima.fundamentos.modelo.ejercicio2.Especie;
import com.hedima.fundamentos.modelo.ejercicio2.Zoo;
import com.hedima.fundamentos.servicio.IAnimalService;
import com.hedima.fundamentos.servicio.IVisitaService;
import com.hedima.fundamentos.servicio.IZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private IVisitaService servicioV;
    @Autowired
    private IAnimalService servicioA;
    @Autowired
    private IZooService servicioZ;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("--Ejerciico 1--");
//        Autobus a1 = new Autobus("8234LMK",2023);
//        Conductor c1 = new Conductor("823456789A","Juan López");
//        Lugar l1 = new Lugar("Segovia");
//        Visita v1 = new Visita(LocalDate.now(),a1,l1,c1);
//        servicioV.crear(v1);

//        System.out.println("--Ejerciico 2--");
//        Especie e1 = new Especie("Canis lupus familiaris", "boxer francés",false,"mamiferos");
//        Zoo z1 = new Zoo(100_000,"España","Madrid","Zoo Madrid",60_000);
//        Animal a2 =new Animal("España",'F',"Europa",LocalDate.of(2020,8,30));
//        Especie e2 = new Especie("Canis lupus familiaris", "boxer francés",false,"mamiferos");
//        Zoo z2 = new Zoo(100_000,"España","Madrid","Zoo Madrid",60_000);
//        Animal a3 =new Animal("Francia",'F',"Europa",LocalDate.of(2020,8,30));
//        Animal a4 =new Animal("UK",'F',"Europa",LocalDate.of(2020,8,30));
//        a2.setZoo(z1);
//        a2.setEspecie(e1);
//        servicioA.crear(a2);
//        a3.setZoo(z2);
//        a3.setEspecie(e2);
//        servicioA.crear(a3);


//        System.out.println("--Ejerciico 3--");
//        Zoo z2 = servicioZ.obtenerUno(1);
//        z2.getAnimales().stream().map(a->a.getAnimalid() + " "+ a.getPaisOrigen())
//                .forEach(System.out::println);



    }
}
