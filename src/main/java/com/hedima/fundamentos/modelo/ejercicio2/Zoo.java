package com.hedima.fundamentos.modelo.ejercicio2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
