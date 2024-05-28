import br.com.alura.scrennmatch.modelos.TituloOmdb;
import br.com.alura.scrennmatch.modelos.excecao.ErroDeConversaoDeAnoException;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.NumberFormatException;
import java.lang.IllegalArgumentException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import br.com.alura.scrennmatch.modelos.Titulo;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = sc.nextLine();
        var apiKey = "CHAVE_FICARÁ_AQUI";

        var endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=" + apiKey;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Título convertido:");
            System.out.println(meuTitulo);

        } catch (NumberFormatException e) {
            System.out.println("Erro: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("O programa finalizou corretamente!");
        sc.close();
    }
}
