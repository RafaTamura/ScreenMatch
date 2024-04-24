package net.personal.screenmatch.model;

import lombok.Getter;
import lombok.Setter;
import net.personal.screenmatch.calculos.Classificavel;

@Getter
@Setter
public class Filme extends Titulo implements Classificavel{
   private String diretor;

   @Override
   public int getClassificacao() {
       return (int) pegaMedia() / 2;
   }
   
}
