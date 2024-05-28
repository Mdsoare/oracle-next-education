package br.com.alura.scrennmatch.exercicios;

public class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}