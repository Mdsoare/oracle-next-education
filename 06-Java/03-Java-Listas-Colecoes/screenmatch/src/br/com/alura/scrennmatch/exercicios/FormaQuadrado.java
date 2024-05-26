package br.com.alura.scrennmatch.exercicios;

public class FormaQuadrado implements Forma {

    @Override
    public void calcularArea(double lado) {
        System.out.println(String.format("A área do quadrado é %.2f", (lado * lado)));
    }
}
