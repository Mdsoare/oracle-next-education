package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComparaNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("Digite um número: ");
            short numero1 = leitor.nextShort();

            System.out.println("Digite outro número: ");
            short numero2 = leitor.nextShort();

            if ( numero1 == numero2) {
                System.out.println( "Os números são iguais!");
            } else if ( numero1 > numero2) {
                System.out.println(String.format("São diferentes.\nO numero %d é maior que o número %d", numero1, numero2));
            } else if ( numero1 < numero2) {
                System.out.println(String.format("São diferentes.\nO numero %d é menor que o número %d", numero1, numero2));
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro! Por favor digite um número válido para ser comparado!");
            leitor.nextLine();
        } finally {
            leitor.close();
        }
    }
}
