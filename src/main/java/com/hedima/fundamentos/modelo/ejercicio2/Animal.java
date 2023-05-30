package com.hedima.fundamentos.modelo.ejercicio2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="animales")
@ToString(onlyExplicitlyIncluded = true)
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer animalid;

    @Column(length = 60)
    private String paisOrigen;
    private char sexo;
    @Column(length = 60)
    private String Continente;
    private LocalDate fNacimiento;
    @JsonIgnore
    @ToString.Exclude
    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "zoo_id", referencedColumnName = "zooId", foreignKey = @ForeignKey(name = "fk_animales_zoos"),
    nullable = false)
    private Zoo zoo;
    @ToString.Exclude
    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "especie_id", referencedColumnName = "especieId", foreignKey = @ForeignKey(name="fk_animales_especies"))
    private Especie especie;

    public Animal(String paisOrigen, char sexo, String continente, LocalDate fNacimiento) {
        this.paisOrigen = paisOrigen;
        this.sexo = sexo;
        Continente = continente;
        this.fNacimiento = fNacimiento;
    }
}
