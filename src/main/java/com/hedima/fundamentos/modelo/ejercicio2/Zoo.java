package com.hedima.fundamentos.modelo.ejercicio2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "zoos")
public class Zoo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer zooId;
    private double extension;
    @Column(length=30)
    private String pais;
    @Column(length=30)
    private String ciudad;
    @Column(length=60)
    private String nombre;
    private double presupuesto;

    @OneToMany(mappedBy = "zoo", fetch = FetchType.EAGER)
    private List<Animal> animales;

    public Zoo(double extension, String pais, String ciudad, String nombre, double presupuesto) {
        this.extension = extension;
        this.pais = pais;
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }
}
