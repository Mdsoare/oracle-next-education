package br.com.alura.scrennmatch.exercicios;

public class ContaBancaria {
    /**
     * @category Attribute Declaration
     */
    private int numeroConta;
    private String titular;
    private double saldo;

    // GETTERS AND SETTERS

    /**
     * @return int return the numeroConta
     */
    public int getNumeroConta() {
        return numeroConta;
    }

    /**
     * @param numeroConta the numeroConta to set
     */
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    /**
     * @return String return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return double return the saldo
     */
    public double getSaldo() {
        return saldo;
    }
}
