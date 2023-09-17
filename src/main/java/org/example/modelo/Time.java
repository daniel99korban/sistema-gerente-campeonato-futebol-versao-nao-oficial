package org.example.modelo;

import org.example.servico.JogadorService;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private Integer id;
    private String nome;
    private List<Jogador> jogadores;
    private Estadio estadio;
    private JogadorService jogadorService;

    public Time(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    public void montarTime(Jogador ...jogadores){// possivelmente será refeita
        for (Jogador jogador: jogadores) {
            this.jogadores.add(jogador);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
}
