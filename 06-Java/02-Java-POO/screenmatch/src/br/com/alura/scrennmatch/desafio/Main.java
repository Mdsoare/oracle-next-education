package br.com.alura.scrennmatch.desafio;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.setTitulo("Deus da minha vida");
        musica1.artistaMusical = "Thalles Roberto";
        musica1.setDuracao(7.10);
        musica1.generoMusical = "Gospel";
        musica1.anoDeLancamento = 2013;

        for (int i = 0; i < 1000; i++) {
            musica1.reproduzir();
        }

        for (int j = 0; j < 500; j++) {
            musica1.curtir();
        }
        musica1.infomacoes();

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("BolhaDev");
        podcast1.apresentador = "Marcus Mendes";
        podcast1.episodio = 3;
        podcast1.descricao = "Um podcast para quem gosta de desenvolvimento";

        for (int i = 0; i < 300; i++) {
            podcast1.reproduzir();
        }

        for (int j = 0; j < 280; j++) {
            podcast1.curtir();
        }
        podcast1.infomacoes();
    }
}
