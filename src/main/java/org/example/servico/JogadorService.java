package org.example.servico;

import org.example.modelo.Genero;
import org.example.modelo.Jogador;
import org.example.modelo.Status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JogadorService {
    private List<Jogador> jogadores;

    public JogadorService() {
        this.jogadores = new ArrayList<>();
    }

    // se o jogador tem um historico de se lesionar ou levar cartões, não fechar contrato
    public boolean contratarJogador(
            String nome,
            LocalDate nasc,
            Genero genero,
            float altura,
            Status status
    ){
        Jogador jogador = new Jogador(nome, nasc, genero, altura, status);
        if(jogador.disponivelParaContrato()){
            System.out.println("Jogador contratado!");
            this.jogadores.add(jogador);
            return true;
        }
        System.out.println("Não é possivel contratar o jogador");
        return false;
    }

    public boolean jogadorLesionado(Jogador jogador){
        return jogador.lesionadoOuContratado();
    }

    public void demitirJogador(Jogador jogador) {
        //this.jogadores.remove(jogador);
    }
}
