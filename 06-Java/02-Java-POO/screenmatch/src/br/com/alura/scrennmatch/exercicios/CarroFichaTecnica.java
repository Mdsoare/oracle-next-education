package br.com.alura.scrennmatch.exercicios;

import java.time.Year;

public class CarroFichaTecnica {
    String modelo;
    String cor;
    int ano;

    void exibeFichaTecnica() {
        System.out.println("O modelo do carro: " + modelo);
        System.out.println("A cor do carro: " + cor);
        System.out.println("O ano do carro: " + ano);
    }

    void exibeAnoDoCarro() {
        int anoAtual = Year.now().getValue();
        System.out.println("A idade do carro é:  " + (anoAtual - ano));
    }
}