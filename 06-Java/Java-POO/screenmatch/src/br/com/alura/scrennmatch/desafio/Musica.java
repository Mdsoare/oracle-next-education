package br.com.alura.scrennmatch.desafio;

public class Musica extends Audio {

    protected String artistaMusical;
    protected String generoMusical;
    protected int anoDeLancamento;

    public void infomacoes() {
        System.out.println("Informações da música:");
        System.out.println("Música: " + getTitulo());
        System.out.println("Cantor: " + artistaMusical);
        System.out.println("Duração: " + getDuracao());
        System.out.println("Gênero: " + generoMusical);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Total de reproduções: " + getTotalDeReproducoes());
        System.out.println("Total de curtidas: " + getTotalDeCurtidas());
        getClassificacao();
        System.out.println("\n");
    }

}