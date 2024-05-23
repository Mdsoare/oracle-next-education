package br.com.alura.scrennmatch.exercicios;

public class Animal {
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println(String.format("%s está fazendo barulho!", this.nome));
    }

}