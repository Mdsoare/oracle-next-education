package br.com.alura.scrennmatch.exercicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class ConsultaLivros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o título do livro: ");
            var titulo = sc.nextLine();

            var chave = "CHAVE_FICARÁ_AQUI";
            var endereco = "https://www.googleapis.com/books/v1/volumes?q=" + titulo + "&key=" + chave;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            System.out.println(response.body());

        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());

        } finally {
            sc.close();
        }

    }
}