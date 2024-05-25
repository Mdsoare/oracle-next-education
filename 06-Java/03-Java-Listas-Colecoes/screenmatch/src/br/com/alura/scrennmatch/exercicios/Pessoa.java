package br.com.alura.scrennmatch.exercicios;

public class Pessoa {
    private String nome;
    private int idade;

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nIdade: " + getIdade() + " anos\n";
    }

}
