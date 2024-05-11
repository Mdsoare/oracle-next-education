package Exercicios;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NumeroPositivoOuNegativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = leitor.nextDouble();

        try {
            if (numero > 0) {
                System.out.println("Número Positivo");
            } else if (numero < 0) {
                System.out.println("Número Negativo");
            } else {
                System.out.println("Nulo");
            }
        } catch (InputMismatchException e) {
            System.out.println("Digite um número válido");
            leitor.nextLine();
        } finally {
            leitor.close();
        }
    }
}