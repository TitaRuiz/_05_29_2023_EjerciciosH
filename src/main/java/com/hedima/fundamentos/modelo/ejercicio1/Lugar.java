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
@Table(name = "lugares")
public class Lugar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLugar;
    @Column(length = 60)
    private String nombre;

    public Lugar(String nombre) {
        this.nombre = nombre;
    }
//    @OneToMany(mappedBy = "lugar",
//            cascade = CascadeType.ALL,
//            orphanRemoval = true,
//            fetch=FetchType.EAGER )
//    private List<Visita> visitas;
}
