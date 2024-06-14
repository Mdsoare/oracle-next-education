package exercicios;

import java.util.InputMismatchException;
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
        } catch (InputMismatchException e) {
            System.out.println("Erro: Input inválido!" + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
