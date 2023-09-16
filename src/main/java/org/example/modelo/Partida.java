package org.example.modelo;

import java.time.LocalDate;

public class Partida {
    private Integer id;
    private LocalDate data;
    private Time timeMandante;
    private Time timeVisitante;
    private Resultado resultado;

    public Partida(Integer id, LocalDate data, Time timeMandante, Time timeVisitante) {
        this.id = id;
        this.data = data;
        this.timeMandante = timeMandante;
        this.timeVisitante = timeVisitante;
    }
}
