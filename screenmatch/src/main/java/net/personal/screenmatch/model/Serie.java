package net.personal.screenmatch.model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

}
