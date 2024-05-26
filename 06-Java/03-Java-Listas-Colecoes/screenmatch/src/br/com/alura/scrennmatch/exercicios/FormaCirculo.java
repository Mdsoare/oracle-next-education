package br.com.alura.scrennmatch.exercicios;

public class FormaCirculo implements Forma {

    //protected double PI = 3.14;

    @Override
    public void calcularArea(double raio) {
        System.out.println(String.format("A área do círculo é %.2f", (Math.PI * raio * raio)));
    }
}