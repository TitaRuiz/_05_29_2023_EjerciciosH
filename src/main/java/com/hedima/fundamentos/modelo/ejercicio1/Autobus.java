package com.hedima.fundamentos.modelo.ejercicio1;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "autobuses")
public class Autobus {
    @Id
    @Column(length = 7)
    private String matricula;
    @Column(nullable = false)
    private Integer aFabricacion;

//    @OneToMany(mappedBy = "autobus",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true,
//            fetch=FetchType.EAGER )
//    private List<Visita> visitas;



    public Autobus(String matricula, Integer aFabricacion) {
        this.matricula = matricula;
        this.aFabricacion = aFabricacion;
    }
}
