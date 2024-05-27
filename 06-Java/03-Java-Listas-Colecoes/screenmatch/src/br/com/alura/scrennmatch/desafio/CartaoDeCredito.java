package br.com.alura.scrennmatch.desafio;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {

    // Variáveis iniciais
    private double limite;
    private double saldo;
    private List<Compra> compras;

    // Construtor
    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    // Valida compra
    public boolean lancaCompra(Compra compra) {
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    // Getters
    public double getLimite() {
        return this.limite;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public List<Compra> getCompras() {
        return this.compras;
    }
}
