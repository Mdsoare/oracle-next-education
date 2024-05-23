package Exercicios;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite a temperatura:");
            String input = sc.nextLine();
            double temperatura = Double.parseDouble(input);
            double convecao = (temperatura * 1.8) + 32;
            System.out.println("A temperatura convertida é " + convecao + "F");
        } catch (InputMismatchException e) {
            System.out.println("Erro! Por favor digite um número válido");
            sc.nextLine();
        } finally {
            sc.close();
        }
    }
}