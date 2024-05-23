package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um número: ");
            short numero = sc.nextShort();

            if (numero > 0){
                int contador = 1;
                while (contador <= 10) {
                    System.out.println(String.format("%d X %d = %d", numero, contador, (numero * contador)));
                    contador++;
                }
            } else {
                System.out.println("Digite um número natural");
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite um número natural!");
            sc.nextLine();
        } finally {
            sc.close();
        }
    }
}