package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoDaArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println(
                    "Selecione a opção desejada:\n1. Calcular área do quadrado.\n2. Calcular área do círculo.");
            short opcaoDesejada = sc.nextShort();
            switch (opcaoDesejada) {
                case 1:
                    System.out.println("Digite o lado do quadrado");
                    double lado = sc.nextDouble();
                    System.out.println("A área do quadrado é: " + lado * lado);
                    break;
                case 2:
                    System.out.println("Digite o raio do cículo:");
                    double raio = sc.nextDouble();
                    System.out.println("A área do círculo é: " + 3.1415 * raio * raio);
                    break;
                default:
                    System.out.println("Erro! Digite uma opção válida");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro! Por favor digite uma opção válida!");
            sc.nextLine(); // limpa o buffer do scanner
        } finally {
            sc.close(); // fecha o scanner
        }
    }
}
