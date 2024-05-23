package br.com.alura.scrennmatch.exercicios;

public class AnimalTeste {
    public static void main(String[] args) {
        System.out.println("\nInstanciando a classe Cachorro:");
        AnimalCachorro cachorro = new AnimalCachorro();
        cachorro.setNome("Scooby Doo");
        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println("\nInstanciando a classe Gato:");
        AnimalGato gato = new AnimalGato();
        gato.setNome("Garfield");
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
