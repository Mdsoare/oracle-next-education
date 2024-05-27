package br.com.alura.scrennmatch.exercicios;

import java.lang.Comparable;

public class Titulo implements Comparable<Titulo> {

    protected String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}
