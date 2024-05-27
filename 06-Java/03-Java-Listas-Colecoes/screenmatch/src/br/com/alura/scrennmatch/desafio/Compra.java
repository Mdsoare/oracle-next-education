package br.com.alura.scrennmatch.desafio;

public class Compra implements Comparable<Compra> {

    // Variaveis iniciais
    private String descricao;
    private double valor;

    // Construtor
    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    // Getters
    public String getDescricao() {
        return this.descricao;
    }

    public double getValor() {
        return this.valor;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "descrição: '" + descricao + '\'' +
                ", valor:" + valor +
                '}';
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
