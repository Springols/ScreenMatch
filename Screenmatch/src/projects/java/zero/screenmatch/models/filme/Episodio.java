package projects.java.zero.screenmatch.models.filme;

import projects.java.zero.screenmatch.calc.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeVisualisacoes;

    public int getTotalDeVisualisacoes() {
        return totalDeVisualisacoes;
    }

    public void setTotalDeVisualisacoes(int totalDeVisualisacoes) {
        this.totalDeVisualisacoes = totalDeVisualisacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalDeVisualisacoes >= 100) {
            return 4;
        }else {
             return 2;
        }
    }
}