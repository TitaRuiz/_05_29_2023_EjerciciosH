package com.hedima.fundamentos.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "visitas")
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate fVisita;

    @ManyToOne
    @JoinColumn(name = "matricula", referencedColumnName = "matricula", foreignKey = @ForeignKey(name= "fk_visitas_autobus"))
    private Autobus autobus;

    @ManyToOne
    @JoinColumn(name = "id_lugar", referencedColumnName="idLugar", foreignKey = @ForeignKey(name= "fk_visitas_lugares"))
    private Lugar lugar;

    @ManyToOne
    @JoinColumn(name = "dni", referencedColumnName="dni", foreignKey=@ForeignKey(name= "fk_visitas_conductores"))
    private Conductor conductor;
}
