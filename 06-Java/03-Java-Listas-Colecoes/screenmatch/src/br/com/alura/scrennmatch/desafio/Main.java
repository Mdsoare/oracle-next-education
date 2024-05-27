package br.com.alura.scrennmatch.desafio;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limite = sc.nextDouble();
        sc.nextLine();

        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        do {
            System.out.println("Digite a descrição da compra: ");
            String descricao = sc.nextLine();

            System.out.println("Digite o valor da compra: ");
            double valor = sc.nextDouble();
            sc.nextLine();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Digite 0 para Sair ou 1 para continuar");
                sair = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Saldo insuficiente!\n");
                sair = 0;
            }

        } while (sair != 0);

        System.out.println("**************************");
        System.out.println("Histórico de compras\n");
        Collections.sort(cartao.getCompras());

        for (Compra c : cartao.getCompras()) {
            System.out.println(c.getDescricao() + " - " + c.getValor());
        }
        System.out.println("\n**************************");

        System.out.println("\nSaldo do cartao: " + cartao.getSaldo() + "\n");
        sc.close();
    }
}
