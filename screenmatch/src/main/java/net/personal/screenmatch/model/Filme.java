package net.personal.screenmatch.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Filme {
    public String nome;
    public int anoDeLancamento;
    public int duracaoEmMinutos;
    public int avaliacao;
    public boolean incluidoNoPlano;
}
