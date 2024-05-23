package br.com.alura.scrennmatch.exercicios;

public class AnimalCachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println(String.format("%s faz au au au!", getNome()));
    }

    public void abanarRabo() {
        System.out.println(String.format("%s está abanado o rabo :) !", getNome()));
    }

}