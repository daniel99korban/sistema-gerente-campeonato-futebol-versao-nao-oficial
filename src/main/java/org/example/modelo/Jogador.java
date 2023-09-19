package org.example.modelo;

import java.time.LocalDate;

public class Jogador {
    private Integer id;
    private String nome;
    private LocalDate nascimento;
    private Genero genero;
    private float altura;
    private Status status;

    public Jogador(
            String nome,
            LocalDate nascimento,
            Genero genero,
            float altura,
            Status status
    ) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
        this.altura = altura;
        this.status = status;
    }

    public void setDataNascimento(LocalDate nasc){
        this.nascimento = nasc;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean disponivelParaContrato(){
        return this.status == Status.DISPONIVEL;
    }

    public boolean lesionadoOuContratado(){
        return this.status == Status.CONTRATADO || this.status == Status.LESIONADO;
    }

}
