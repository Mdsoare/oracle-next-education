package br.com.alura.scrennmatch.exercicios;

public class NumerosPrimosTeste {
    public static void main(String[] args) {
        NumerosPrimosVerificador verificador = new NumerosPrimosVerificador();
        verificador.verificarSeEhPrimo(17);

        NumerosPrimosGerador gerador = new NumerosPrimosGerador();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
