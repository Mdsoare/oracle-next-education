package main;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ConversorDeMoeda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double valorParaConverter;
        do {
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileiro");
            System.out.println("4) Real brasileiro => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida:");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 6) {
                System.out.println("Digite o valor que deseja converter:");
                valorParaConverter = scanner.nextDouble();
            } else {
                valorParaConverter = 0;
            }

            switch (opcao) {
                case 1:
                    converterMoeda("USD", "ARS", valorParaConverter);
                    break;
                case 2:
                    converterMoeda("ARS", "USD", valorParaConverter);
                    break;
                case 3:
                    converterMoeda("USD", "BRL", valorParaConverter);
                    break;
                case 4:
                    converterMoeda("BRL", "USD", valorParaConverter);
                    break;
                case 5:
                    converterMoeda("USD", "COP", valorParaConverter);
                    break;
                case 6:
                    converterMoeda("COP", "USD", valorParaConverter);
                    break;
                case 7:
                    System.out.println("Obrigado por usar o conversor de moedas!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
    }

    public static void converterMoeda(String moedaOrigem, String moedaDestino, double valor) {
        String apiKey = "*************";
        String url_str = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + moedaOrigem;

        try {
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            JsonParser jp = new JsonParser();
            JsonObject jsonobj = jp.parse(new InputStreamReader((InputStream) request.getContent())).getAsJsonObject();
            JsonObject rates = jsonobj.getAsJsonObject("conversion_rates");
            double taxaConversao = rates.get(moedaDestino).getAsDouble();
            double valorConvertido = valor * taxaConversao;

            System.out.printf("Valor %.2f [%s] corresponde ao valor final de %.2f [%s]%n"
						, valor, moedaOrigem, valorConvertido, moedaDestino);
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
        }
    }
}
