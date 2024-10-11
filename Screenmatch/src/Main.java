import projects.java.zero.screenmatch.calc.CalculadoraDeTempo;
import projects.java.zero.screenmatch.calc.FiltroRecomendacao;
import projects.java.zero.screenmatch.models.filme.Episodio;
import projects.java.zero.screenmatch.models.filme.Filme;
import projects.java.zero.screenmatch.models.filme.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme filme01 = new Filme();
        filme01.setNome("Blade runner 2049");
        filme01.setAnoDeLancamento(2017);
        filme01.setDuracao(180);

        filme01.exibeFichaTecnica();
        filme01.avalia(4.3);
        filme01.avalia(6.5);
        filme01.avalia(8);
        filme01.avalia(8);
        filme01.avalia(9);
        filme01.avalia(10);

        System.out.println("Média de avaliações do filme: " + filme01.calculaMedia());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(1);
        lost.setEpisodios(10);
        lost.setMinutosPorEpisodio(24);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracao());

       CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
       calculadora.inclui(filme01);
       calculadora.inclui(lost);
       System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme01);

        Episodio episidio = new Episodio();
        episidio.setNumero(1);
        episidio.setSerie(lost);
        episidio.setTotalDeVisualisacoes(300);
        filtro.filtra(episidio);

        var filmeDoPaulo = new Filme();
        filmeDoPaulo.getDuracaoEmMinutos(200);
        filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme>listaDefilmes = new ArrayList<>();
        listaDefilmes.add(filmeDoPaulo);
        listaDefilmes.add(filme01);
        System.out.println("Tamanho da lista " + listaDefilmes.size());
        System.out.println("Primeiro filme  " + listaDefilmes.get(0).getNome());

        for (int index = 0; index < 3; index++) {System.out.println(String.format("Filme %d: %s.", index+1,listaDefilmes.get(index).getNome()));}
    }
}