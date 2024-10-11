package projects.java.zero.screenmatch.models.filme;

import projects.java.zero.screenmatch.calc.Classificavel;

public class Filme extends Titulo implements Classificavel {

    String Diretor;

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }
    @Override
    public int getClassificacao() {
        return (int)calculaMedia()/2;
    }
}