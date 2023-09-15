package org.modelos;

import java.util.ArrayList;
import java.util.List;

public class Resultado {
    private Integer numGolsMandante;
    private Integer numGolsVisitante;
    private List<Cartao> cartoes;

    public Resultado() {
        this.cartoes = new ArrayList<>();
    }

    int getPontuacaoMandante(){
        return 0;
    }
    int getPontuacaoVisitante(){
        return 0;
    }

    boolean jogoSaiuEmpatado(){
        return false;
    }

    int getTotalEscanteios(){
        return 0;
    }

    int getTotalCartoes(){
        return this.cartoes.size();
    }

    public void setCartoes(List<Cartao> cartoes) {
        this.cartoes = cartoes;
    }
}
