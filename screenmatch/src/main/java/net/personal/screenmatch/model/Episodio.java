package net.personal.screenmatch.model;

import lombok.Getter;
import lombok.Setter;
import net.personal.screenmatch.calculos.Classificavel;

@Getter
@Setter

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    @Override
    public int getClassificacao() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
