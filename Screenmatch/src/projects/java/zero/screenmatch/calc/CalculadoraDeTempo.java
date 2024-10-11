package projects.java.zero.screenmatch.calc;

import projects.java.zero.screenmatch.models.filme.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }
//
//   public void inclui(Filme f) {
//        tempoTotal += f.getDuracao();
//    }
//   public void inclui(Serie s) {
//        tempoTotal += s.getDuracao();
//    }
    public void inclui(Titulo titulo) {
    System.out.println("Adicionando Duração para o titulo: " + titulo.getNome());
        this.tempoTotal += titulo.getDuracao();
    }
}