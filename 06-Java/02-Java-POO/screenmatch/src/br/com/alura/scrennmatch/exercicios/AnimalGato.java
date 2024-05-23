package br.com.alura.scrennmatch.exercicios;

public class AnimalGato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println(String.format("%s faz miau miau!", getNome()));
    }

    public void arranharMoveis() {
        System.out.println(String.format("%s está arranhando os móveis :( !", getNome()));
    }
}