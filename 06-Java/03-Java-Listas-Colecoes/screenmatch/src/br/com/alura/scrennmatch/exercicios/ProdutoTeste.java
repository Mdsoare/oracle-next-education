package br.com.alura.scrennmatch.exercicios;

import java.util.ArrayList;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Óleo";
        produto1.preco = 5.19;
        produto1.quantidade = 25;

        Produto produto2 = new Produto("Leite");
        // produto2.nome = "Leite";
        produto2.preco = 4.99;
        produto2.quantidade = 80;

        Produto produto3 = new Produto();
        produto3.nome = "Margarina";
        produto3.preco = 7.38;
        produto3.quantidade = 53;

        ArrayList<Produto> listaDeProdutor = new ArrayList<>();
        listaDeProdutor.add(produto1);
        listaDeProdutor.add(produto2);
        listaDeProdutor.add(produto3);
        System.out.println("\nTamanho da lista: " + listaDeProdutor.size());
        System.out.println("\nTerceiro ítem: " + listaDeProdutor.get(2).nome);
        System.out.println(listaDeProdutor);

        for (Produto produto : listaDeProdutor) {
            System.out.println(produto);
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Carne");
        produtoPerecivel.preco = 38.99;
        produtoPerecivel.quantidade = 20;
        try {
            produtoPerecivel.setValidade("23/10/2024");
        } catch (Exception e) {
            System.out.println("Erro ao definir a validade: " + e.getMessage());
        }
        System.out.println("Nome: " + produtoPerecivel.nome);
        System.out.println("Preço: " + produtoPerecivel.preco);
        System.out.println("Quantidade: " + produtoPerecivel.quantidade);
        System.out.println("Data de Validade: " + produtoPerecivel.dataValidade);

        listaDeProdutor.forEach(System.out::println);

    }
}