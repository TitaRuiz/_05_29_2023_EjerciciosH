package com.hedima.fundamentos.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "autobuses")
public class Autobus {
    @Id
    @Column(length = 7)
    private String matricula;
    @Column(nullable = false)
    private Integer aFabricacion;
}
