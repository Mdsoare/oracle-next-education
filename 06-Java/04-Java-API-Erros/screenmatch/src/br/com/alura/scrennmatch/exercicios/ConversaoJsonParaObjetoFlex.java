package br.com.alura.scrennmatch.exercicios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

record Pessoa(String nome, int idade, String cidade) {}

public class ConversaoJsonParaObjetoFlex {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"João\",\"cidade\":\"Salvador\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}