package br.com.alura.scrennmatch.exercicios;

public class MusicaFichaTecnica {

    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artísta: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void pegaAvaliacao(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / numAvaliacoes;
    }

}
