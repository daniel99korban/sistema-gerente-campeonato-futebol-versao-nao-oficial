package example.modelo;

import java.util.ArrayList;
import java.util.List;

public class ResultadoTest {
    private Integer numGolsMandante;
    private Integer numGolsVisitante;
    private List<CartaoTest> cartoes;

    public ResultadoTest() {
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

    public void setCartoes(List<CartaoTest> cartoes) {
        this.cartoes = cartoes;
    }
}
