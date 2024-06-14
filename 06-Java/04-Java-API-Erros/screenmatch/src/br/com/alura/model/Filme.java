package br.com.alura.model;

import br.com.alura.service.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    // Constructor
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    /**
     * @return String return the diretor
     */
    public String getDiretor() {
        return this.diretor;
    }

    /**
     * @param diretor the diretor to set
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}