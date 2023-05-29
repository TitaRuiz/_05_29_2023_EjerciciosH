package com.hedima.fundamentos.modelo.ejercicio1;

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

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "matricula", referencedColumnName = "matricula", foreignKey = @ForeignKey(name= "fk_visitas_autobus"))
    private Autobus autobus;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "id_lugar", referencedColumnName="idLugar", foreignKey = @ForeignKey(name= "fk_visitas_lugares"))
    private Lugar lugar;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "dni", referencedColumnName="dni", foreignKey=@ForeignKey(name= "fk_visitas_conductores"))
    private Conductor conductor;

    public Visita(LocalDate fVisita, Autobus autobus, Lugar lugar, Conductor conductor) {
        this.fVisita = fVisita;
        this.autobus = autobus;
        this.lugar = lugar;
        this.conductor = conductor;
    }
}
