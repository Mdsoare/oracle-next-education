package br.com.alura.scrennmatch.desafio;

public class Podcast extends Audio {
    protected int episodio;
    protected String apresentador;
    protected String descricao;


    public void infomacoes() {
        System.out.println("Informações do podcast:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Apresentador: " + apresentador);
        System.out.println("Descrição: " + descricao);
        System.out.println("Episódio: " + episodio);
        System.out.println("Total de reproduções: " + getTotalDeReproducoes());
        System.out.println("Total de curtidas: " + getTotalDeCurtidas());
        getClassificacao();
        System.out.println("\n");
    }
}
