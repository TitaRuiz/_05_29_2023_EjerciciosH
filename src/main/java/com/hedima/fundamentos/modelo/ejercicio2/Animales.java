package com.hedima.fundamentos.modelo.ejercicio2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="animales")
public class Animales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer animalid;

    @Column(length = 60)
    private String paisOrigen;
    private char sexo;
    @Column(length = 60)
    private String Continente;
    private LocalDate fNacimiento;

    @ManyToOne
    @JoinColumn(name = "zoo_id", referencedColumnName = "zooId", foreignKey = @ForeignKey(name = "fk_animales_zoos"),
    nullable = false)
    private Zoo zoo;

    @ManyToOne
    @JoinColumn(name = "especie_id", referencedColumnName = "especieId", foreignKey = @ForeignKey(name="fk_animales_especies"))
    private Especie especie;


}
