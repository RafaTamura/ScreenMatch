package net.personal.screenmatch.calculos;

import net.personal.screenmatch.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public String inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
        return "Adicionando duração em minutos de  " + titulo.getNome();
    }
}


