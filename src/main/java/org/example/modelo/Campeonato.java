package org.example.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private Integer id;
    private Integer ano;
    private String nome;
    private List<Time> times;
    private List<Partida> partidas;

    public Campeonato() {// numero de partidas deve ser passado para o construtor
        this.partidas = new ArrayList<>();
    }
}
