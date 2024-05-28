package br.com.alura.scrennmatch.exercicios;

import java.util.Scanner;

public class ExercicioDivisao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numerador: ");
        int numerador = sc.nextInt();

        System.out.println("Informe o denominador: ");
        int denominador = sc.nextInt();

        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida.");
        } finally {
            sc.close();
        }
    }
}

