package net.personal.screenmatch.controller;


import net.personal.screenmatch.model.Filme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class principal {
    @GetMapping("/filme")
    public String filmes() {
        Filme meuFilme = new Filme();

        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.duracaoEmMinutos = 175;
        meuFilme.avaliacao = 9;
        meuFilme.incluidoNoPlano = true;

        return "Nome: " + meuFilme.nome + "<br>" +
                "Ano de lançamento: " + meuFilme.anoDeLancamento + "<br>" +
                "Duração em minutos: " + meuFilme.duracaoEmMinutos + "<br>" +
                "Avaliação: " + meuFilme.avaliacao + "<br>" +
                "Incluído no plano: " + meuFilme.incluidoNoPlano; 

        

    }


}
