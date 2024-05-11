package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um número natural");
            short numeroDigitado = sc.nextShort();
            short calculo = numeroDigitado;

            if (calculo == 0 || calculo == 1) {
                System.out.println(String.format("O fatorial de %d! é 1", numeroDigitado));
            } else if (calculo > 1) {
                int contador = calculo;
                int fatorial = 1;
                while (contador > 0) {
                    fatorial *= (calculo--);
                    contador--;
                }
                System.out.println(String.format("O fatorial do número %d! é %d", numeroDigitado, fatorial));
            } else {
                System.out.println("Erro! Não existe fatorial de número negativo");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro! Digite um número natural");
            sc.nextLine();
        } finally {
            sc.close();
        }
    }
}
