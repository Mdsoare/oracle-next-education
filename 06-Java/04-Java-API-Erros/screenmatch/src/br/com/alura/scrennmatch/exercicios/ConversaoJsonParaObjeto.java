package br.com.alura.scrennmatch.exercicios;

import com.google.gson.Gson;

record Pessoa(String nome,int idade,String cidade){}

public class ConversaoJsonParaObjeto {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"Jose\",\"idade\":18,\"cidade\":\"São Paulo\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}