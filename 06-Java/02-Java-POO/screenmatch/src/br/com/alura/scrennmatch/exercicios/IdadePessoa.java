package br.com.alura.scrennmatch.exercicios;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade() {
        if (this.idade >= 18) {
            System.out.println(String.format("%s é maior de idade!", this.nome));
        } else {
            System.out.println(String.format("%s é menor de idade!", this.nome));
        }
    }
}
