package Exercicios;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao jogo de advinhar o número secreto");
        System.out.println("Você terá 5 tentativas para acertar o número secreto");
        System.out.println("Você deve digitar um número entre 0 e 100\n");
        Scanner leitura = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int tentativa = 0;
        byte chute = 0;

        while (tentativa < 5) {
            try {
                System.out.println("Digite um número: ");
                chute = leitura.nextByte();
                tentativa++;

                if (chute < 0) {
                    System.out.println("Ah não! Você precisa digitar um número entre 0 e 100");
                } else if (chute == numeroSecreto) {
                    System.out.println("Parabéns! Você acertou o número secreto em " + tentativa + " tentativas!");
                    break;
                } else if (chute > numeroSecreto) {
                    System.out.println(String.format("O número secreto é menor que %d\n", chute));
                } else {
                    System.out.println(String.format("O número secreto é maior que %d\n", chute));
                }
            } catch (InputMismatchException e) {
                System.out
                        .println("ERRO! Entrada inválida.\nPara jogar é necessário digitar um número entre 0 e 100\n");
                break;
            }
        }

        if (tentativa == 5 && chute != numeroSecreto) {
            System.out.println("\nAh não! Você não conseguiu acertar o número secreto " + numeroSecreto + "\n");
        }
        leitura.close();
    }
}
