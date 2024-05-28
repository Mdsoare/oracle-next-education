package br.com.alura.scrennmatch.exercicios;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaReceita {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o nome da receita para a busca: ");
            var nomeReceita = sc.nextLine();

            String endereco = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + nomeReceita;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
