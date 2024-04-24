package net.personal.screenmatch.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private double totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public String exibeFichaTecnica(){
        return "Nome do filme: " + nome + "\nAno de lançamento: " + anoDeLancamento;
        // System.out.println("Nome do filme: " + nome);
        // System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public double avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
        return somaDasAvaliacoes;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
