package br.com.alura.scrennmatch.exercicios;

import java.util.ArrayList;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João");
        pessoa1.setIdade(25);
        System.out.println(pessoa1.toString());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria");
        pessoa2.setIdade(17);
        System.out.println(pessoa2.toString());

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Paula");
        pessoa3.setIdade(28);
        System.out.println(pessoa3.toString());

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);
        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0).getNome());
        System.out.println("Lista completa: " + listaDePessoas.toString());
    }
}
