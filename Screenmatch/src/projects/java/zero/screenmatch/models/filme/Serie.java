package projects.java.zero.screenmatch.models.filme;

public class Serie extends Titulo {

    private int temporadas;
    private int episodios;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracao() {
        return temporadas * episodios * minutosPorEpisodio;
    }
}