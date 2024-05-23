package br.com.alura.scrennmatch.exercicios;

public class MusicaFichaTecnicaTeste {
    public static void main(String[] args) {
        System.out.println("\nInstanciando a classe Musica");
        MusicaFichaTecnica musica = new MusicaFichaTecnica();
        musica.titulo = "Seja o centro";
        musica.artista = "Diante do Trono";
        musica.anoLancamento = 2016;
        musica.pegaAvaliacao(10);
        musica.pegaAvaliacao(9.8);
        musica.pegaAvaliacao(8.9);
        musica.pegaAvaliacao(9.5);
        System.out.println("o número de avaliações é: " + musica.numAvaliacoes);
        System.out.println("A média das avaliações é: " + musica.pegaMedia());

    }
}
