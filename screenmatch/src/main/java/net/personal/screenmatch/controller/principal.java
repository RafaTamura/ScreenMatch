package net.personal.screenmatch.controller;
import net.personal.screenmatch.calculos.CalculadoraDeTempo;
import net.personal.screenmatch.calculos.FiltroRecomendacao;
import net.personal.screenmatch.model.Episodio;
import net.personal.screenmatch.model.Filme;
import net.personal.screenmatch.model.Serie;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class principal {
    @GetMapping("/filme")
    public String filme(){

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        // System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        // System.out.println(meuFilme.pegaMedia());
        // meuFilme.somaDasAvaliacoes = 10;
        // meuFilme.totalDeAvaliacoes = 1;
        // System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDaRafa = new Filme();
        filmeDaRafa.setDuracaoEmMinutos(200);
        filmeDaRafa.setNome("Dogville");
        filmeDaRafa.setAnoDeLancamento(2003);
        filmeDaRafa.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaRafa);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);


        return 
        "Nome do filme: " + meuFilme.getNome() + "<br>" +
         "Ano de lançamento: " + meuFilme.getAnoDeLancamento() + "<br>" +
        "Duração: " + meuFilme.getDuracaoEmMinutos() + " minutos" + "<br>" +
         "Total de avaliações: " + meuFilme.getTotalDeAvaliacoes() + "<br>" +
        "Média de avaliações: " + meuFilme.pegaMedia() + "<br>" +
         "Duração para maratonar Lost: " + lost.getDuracaoEmMinutos() + "<br>" +
         "Duração total: " + calculadora.getTempoTotal() + "<br>" +
         "Recomendação: " + filtro.filtra(meuFilme) + "<br>" +
         "Recomendação: " + filtro.filtra(episodio) + "<br>" +
         "Tamanho da lista: " + listaDeFilmes.size() + "<br>" +
         "Primeiro filme: " + listaDeFilmes.get(0).getNome() + "<br>" +
         "Lista de filmes: " + listaDeFilmes + "<br>"

        ;
    }
}
