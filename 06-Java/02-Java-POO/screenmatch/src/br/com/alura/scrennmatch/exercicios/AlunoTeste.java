package br.com.alura.scrennmatch.exercicios;

public class AlunoTeste {
    public static void main(String[] args) {
        System.out.println("\nInstanciando a classe Aluno:");
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.idade = 14;
        aluno1.exibeInformacoes();
    }
}
