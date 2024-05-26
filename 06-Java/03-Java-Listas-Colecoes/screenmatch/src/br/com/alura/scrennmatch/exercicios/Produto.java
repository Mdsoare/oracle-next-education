package br.com.alura.scrennmatch.exercicios;

public class Produto {
    protected String nome;
    protected double preco;
    protected int quantidade;

    // Constructors
    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto() {
    }

    @Override
    public String toString() {
        return "\nNome do produto: " + this.nome
                + "\nPreço: R$ " + this.preco
                + "\nQuantidade em estoque: " + this.quantidade;
    }
}
