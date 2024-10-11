package projects.java.zero.screenmatch.models.filme;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluesoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracao;
    private int duracaoEmMinutos;


    public void getDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;

    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluesoNoPlano() {
        return incluesoNoPlano;
    }

    public int getDuracao() {
        return duracao;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluesoNoPlano(boolean incluesoNoPlano) {
        this.incluesoNoPlano = incluesoNoPlano;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double calculaMedia(){
        return (somaDasAvaliacoes / totalDeAvaliacao);

    }
}