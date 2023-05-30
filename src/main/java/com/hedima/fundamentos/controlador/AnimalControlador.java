package com.hedima.fundamentos.controlador;

import com.hedima.fundamentos.modelo.ejercicio2.Animal;
import com.hedima.fundamentos.servicio.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/animales")
@Controller
public class AnimalControlador {
    @Autowired
    private IAnimalService servicioA;

    //Obtener de la BBDD animales
    //Select * from animales
    @GetMapping
    public String mostrarAnimales(Model modelo) {
        List<Animal> animales = servicioA.consultarTodos();
        modelo.addAttribute("animales",animales);
        return "mostraranimales";
    }

}
