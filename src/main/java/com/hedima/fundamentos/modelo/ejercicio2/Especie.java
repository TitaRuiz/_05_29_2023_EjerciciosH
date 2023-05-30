package com.hedima.fundamentos.modelo.ejercicio2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "especies")
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer especieId;
    @Column(length =60)
    private String nCientifico;
    @Column(length =50)
    private String nVulgar;
    private boolean peligroExtincion;
    @Column(length =50)
    private String familia;

    public Especie(String nCientifico, String nVulgar, boolean peligroExtincion, String familia) {
        this.nCientifico = nCientifico;
        this.nVulgar = nVulgar;
        this.peligroExtincion = peligroExtincion;
        this.familia = familia;
    }
}
