package br.com.alura.scrennmatch.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TituloTeste {
    public static void main(String[] args) {

        // Meus livros favoritos
        Titulo livro1 = new Titulo("Reformando o Discipulado");
        Titulo livro2 = new Titulo("Nascido Escravo");
        Titulo livro3 = new Titulo("A Bíblia e Seus Intérpretes");
        Titulo livro4 = new Titulo("Pregador Leigo");
        Titulo livro5 = new Titulo("Enciclopédia Teológica Champlin");

        System.out.println("\n########## Meus Livros ##########");
        ArrayList<Titulo> meusLivros = new ArrayList<>();
        meusLivros.add(livro1);
        meusLivros.add(livro2);
        meusLivros.add(livro3);
        meusLivros.add(livro4);
        meusLivros.add(livro5);

        Collections.sort(meusLivros);
        meusLivros.forEach(livro -> System.out.println(livro.nome));

        // Meus escritores favoritos
        Titulo escritor1 = new Titulo("Augustus Nicodemus");
        Titulo escritor2 = new Titulo("Hernandes Dias Lopes");
        Titulo escritor3 = new Titulo("Mayer Pearlman");
        Titulo escritor4 = new Titulo("John Piper");
        Titulo escritor5 = new Titulo("João Calvino");
        Titulo escritor6 = new Titulo("Antônio Gilberto");

        System.out.println("\n########## Meus Escritores ##########");
        List<Titulo> meusEscritores = new ArrayList<>();
        meusEscritores.add(escritor1);
        meusEscritores.add(escritor2);
        meusEscritores.add(escritor3);
        meusEscritores.add(escritor4);
        meusEscritores.add(escritor5);
        meusEscritores.add(escritor6);

        Collections.sort(meusEscritores);
        // Imprimindo os nomes dos livros usando Stream API
        meusEscritores.stream()
                .map(escritor -> escritor.nome)
                .forEach(System.out::println);

        // Minhas Músicas Favoritas
        Titulo musica1 = new Titulo("Autor da Minha Fé");
        Titulo musica2 = new Titulo("Meu Tributo");
        Titulo musica3 = new Titulo("O Amor é Tudo");
        Titulo musica4 = new Titulo("Eram Cem Ovelhas");
        Titulo musica5 = new Titulo("O Rei está Voltando");

        System.out.println("\n########## Minhas Músicas ##########");
        List<Titulo> minhasMusicas = new LinkedList<>();
        minhasMusicas.add(musica1);
        minhasMusicas.add(musica2);
        minhasMusicas.add(musica3);
        minhasMusicas.add(musica4);
        minhasMusicas.add(musica5);

        Collections.sort(minhasMusicas);
        for (Titulo musica : minhasMusicas) {
            System.out.println(musica.nome);
        }

        System.out.println("\n########## Lista Polimórfica ##########");
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Numero 1");
        listaPolimorfica.add("Numero 2");
        listaPolimorfica.add("Numero 3");
        listaPolimorfica.add("Numero 4");
        listaPolimorfica.forEach(System.out::println);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Cor 1");
        listaPolimorfica.add("Cor 2");
        listaPolimorfica.add("Cor 3");
        listaPolimorfica.add("Cor 4");
        listaPolimorfica.forEach(System.out::println);

    }
}
