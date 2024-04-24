package net.personal.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public String filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4 ){
            return "Recomendado";
        } else if (classificavel.getClassificacao() >= 2){
            return "Talvez seja do seu interesse";
        } else {
           return "Não recomendado";
        }
    }
}
