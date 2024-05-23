package br.com.alura.scrennmatch.exercicios;

public class CalcularDobroTeste {
    public static void main(String[] args) {
        System.out.println("\nInstanciando CalcularDobro");
        CalcularDobro calculo = new CalcularDobro();
        System.out.println("O dobro do número digitado é: " + calculo.retornaODobro(5));
    }
}
