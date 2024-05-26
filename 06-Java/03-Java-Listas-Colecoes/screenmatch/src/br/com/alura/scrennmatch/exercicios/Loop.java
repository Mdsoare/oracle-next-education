package br.com.alura.scrennmatch.exercicios;

import java.util.ArrayList;

public class Loop {
    public static void main(String[] args) {
        ArrayList<String> listaExemplo = new ArrayList<>();
        listaExemplo.add("Allan");
        listaExemplo.add("Pedro");
        listaExemplo.add("Arrascaeta");
        listaExemplo.add("De La Cruz");

        listaExemplo.forEach(item -> System.out.println(item));
        System.out.println("\n");
        listaExemplo.forEach(System.out::println);
    }

}
