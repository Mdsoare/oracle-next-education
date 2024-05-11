package Exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DesafioContaBancaria {

    private static final short CONSULTAR_SALDO = 1;
    private static final short RECEBER_VALOR = 2;
    private static final short TRANSFERIR_VALOR = 3;
    private static final short SAIR = 4;

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nomeDoCliente = "Edge Broker";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("\n*********************************\n");
        System.out.println(String.format("Nome do cliente: %s", nomeDoCliente));
        System.out.println(String.format("Tipo de conta: %s", tipoConta));
        System.out.println(String.format("Saldo atual: %.2f", saldo));
        System.out.println("\n*********************************\n");
        short opcao = SAIR;

        do {
            System.out.println("Operações:\n");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair\n");
            System.out.print("Digite sua opção: ");

            try {
                opcao = leitor.nextShort();

                switch (opcao) {
                    case CONSULTAR_SALDO:
                        System.out.println(String.format("O saldo atualizado é R$ %.2f\n", saldo));
                        break;
                    case RECEBER_VALOR:
                        System.out.println("Qual é o valor que deseja Receber? ");
                        double valorReceber = leitor.nextDouble();
                        saldo += valorReceber;
                        System.out.println(
                                String.format("Operação realizada com sucesso!\nO saldo atual é R$ %.2f\n", saldo));

                        break;
                    case TRANSFERIR_VALOR:
                        System.out.println("Qual é o valor que deseja transferir? ");
                        double valorTransferir = leitor.nextDouble();
                        if (valorTransferir > saldo) {
                            System.out.println(
                                    String.format("Erro! Saldo insuficiente\nO saldo atual é R$ %.2f\n", saldo));
                        } else {
                            saldo -= valorTransferir;
                            System.out.println(String
                                    .format("Operação realizada com sucesso!\nO saldo atual é R$ %.2f", saldo));
                        }
                        break;
                    case SAIR:
                        System.out.println("Ok! Aguardamos seu retorno.\n");
                        break;
                    default:
                        System.out.println("Opção inválida! Você precisa escolher entre 1 e 4\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro! Digite um número válido entre 1 e 4\n");
                leitor.nextLine();
            }
        } while (opcao != SAIR);

        leitor.close();
    }
}
