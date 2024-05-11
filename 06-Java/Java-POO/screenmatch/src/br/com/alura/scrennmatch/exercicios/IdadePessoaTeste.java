package br.com.alura.scrennmatch.exercicios;

public class IdadePessoaTeste {
    public static void main(String[] args) {
        // instanciando classe IdadePessoa
        IdadePessoa pessoa1 = new IdadePessoa();

        pessoa1.setNome("João");
        pessoa1.setIdade(18);
        pessoa1.verificaIdade();

        IdadePessoa pessoa2 = new IdadePessoa();

        pessoa2.setNome("Maria");
        pessoa2.setIdade(15);
        pessoa2.verificaIdade();

        IdadePessoa pessoa3 = new IdadePessoa();

        pessoa3.setNome("Otávio");
        pessoa3.setIdade(25);
        pessoa3.verificaIdade();

    }
}
