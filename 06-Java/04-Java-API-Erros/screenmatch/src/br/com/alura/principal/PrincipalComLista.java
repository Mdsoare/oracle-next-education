package br.com.alura.principal;

import br.com.alura.model.Filme;
import br.com.alura.model.Serie;
import br.com.alura.model.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class PrincipalComLista {
    public static void main(String[] args) {
        Filme filme1 = new Filme("The Matrix", 1999);
        filme1.avalia(9);
        Filme filme2 = new Filme("O Poderoso Chefão", 1970);
        filme2.avalia(6);
        Filme filme3 = new Filme("Dogville", 2003);
        filme3.avalia(10);
        Serie serie1 = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

        for (Titulo item : lista) {
            System.out.println(item.getNome());

            if (item instanceof Filme) {
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }

            /*
             * No Java 14:
             * if (item instanceof Filme filme) {
             * System.out.println("Classificação: " + filme.getClassificacao());
             * }
             */

            /*
             * No Java 17:
             * if (item instanceof Filme filme && filme.getClassificacao() > 2) {
             * System.out.println("Classificação: " + filme.getClassificacao());
             * }
             */

            /*
             * Outra forma de tratamento de erro seria com try-catch:
             *
             * try {
             * Filme filme = (Filme) item;
             * System.out.println("Classificação: " + filme.getClassificacao());
             * } catch (Exception e) {
             * System.out.println("Erro ao tentar definir uma série como filme!"); //+
             * e.getMessage());
             * }
             */

            System.out.println("\n");

            List<String> buscaPorArtista = new LinkedList<>();
            buscaPorArtista.add("Adan Sandler");
            buscaPorArtista.add("Demi Moore");
            buscaPorArtista.add("Will Smith");
            buscaPorArtista.add("Angelina Jolie");
            buscaPorArtista.add("Denzel Washington");
            buscaPorArtista.add("Jennifer Lawrence");
            buscaPorArtista.add("Robert Downey Jr.");
            buscaPorArtista.add("Emma Stone");
            buscaPorArtista.add("Nicolas Cage");
            buscaPorArtista.add("Salma Hayek");
            buscaPorArtista.add("Tom Hanks");

            System.out.println("\nTamanho da lista: " + buscaPorArtista.size());
            Collections.sort(buscaPorArtista);
            buscaPorArtista.forEach(System.out::println);

            System.out.println("\n############# Lista ordenada de títulos por nome #############");
            Collections.sort(lista);
            lista.forEach(System.out::println);

            System.out.println("\n############# Lista ordenada de títulos por Ano #############");
            lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
            lista.forEach(System.out::println);
        }
    }
}