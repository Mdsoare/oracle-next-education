package br.com.alura.scrennmatch.exercicios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Titulo {
    protected String nome;

    public Titulo (String nome){
        this.nome = nome;
    }
    public static void main(String[] args) {
        Titulo titulo = new Titulo("MeuTitulo");

        Gson gson1 = new Gson();
        String json1 = gson1.toJson(titulo);

        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        String json2 = gson2.toJson(titulo);

        System.out.println(json1);
        System.out.println(json2);
    }
}
