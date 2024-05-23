package br.com.alura.scrennmatch.exercicios;

public class ConversorMoeda implements ConversaoMoedaFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double COTACAO_DOLAR = 5.14;
        double valorReal = COTACAO_DOLAR * valorDolar;
        System.out.println(String.format("o valor de $ %.2f é de R$ %.2f", valorDolar, valorReal));
    }
}
