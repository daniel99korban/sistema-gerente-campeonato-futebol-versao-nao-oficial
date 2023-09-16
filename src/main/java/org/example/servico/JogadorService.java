package org.example.servico;

import org.example.modelo.Jogador;
import org.example.modelo.StatusJogador;

public class JogadorService {

    // se o jogador tem um historico de se lesionar ou levar cartões, não fechar contrato
    public boolean contratarJogador(Jogador jogador){
        if(jogador.getStatus() == StatusJogador.CONTRATADO){
            System.out.println("Não é possivel contratar o jogador");
            return false;
        }
        System.out.println("Jogador contratado!");
        jogador.setStatus(StatusJogador.CONTRATADO);
        return true;
    }

    public void demitirJogador(Jogador jogador) {
        //this.jogadores.remove(jogador);
    }
}
