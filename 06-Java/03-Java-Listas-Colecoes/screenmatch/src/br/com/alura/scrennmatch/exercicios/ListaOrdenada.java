package br.com.alura.scrennmatch.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaOrdenada {
    public static void main(String[] args) {
        List<Integer> numerosInteiros = new ArrayList<>();
        numerosInteiros.add(17);
        numerosInteiros.add(0);
        numerosInteiros.add(5);
        numerosInteiros.add(26);
        numerosInteiros.add(11);
        numerosInteiros.add(9);
        numerosInteiros.add(6);

        Collections.sort(numerosInteiros);
        numerosInteiros.forEach(System.out::println);
    }
}