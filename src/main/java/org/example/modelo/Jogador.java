package org.example.modelo;

import java.time.LocalDate;

public class Jogador {
    private Integer id;
    private String nome;
    private LocalDate nascimento;
    private Genero genero;
    private float altura;
    private StatusJogador status;

    public Jogador(String nome, LocalDate nascimento, Genero genero, float altura) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
        this.altura = altura;
        this.status = StatusJogador.DISPONIVEL;// Estado inicial de um jogador
    }

    public void setDataNascimento(String dia, String mes, String ano){
        // code aqui
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public float getAltura() {
        return altura;
    }

    public StatusJogador getStatus() {
        return status;
    }

    public void setStatus(StatusJogador status) {
        this.status = status;
    }
}
