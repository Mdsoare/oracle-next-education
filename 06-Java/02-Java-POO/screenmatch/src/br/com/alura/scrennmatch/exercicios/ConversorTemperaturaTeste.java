package br.com.alura.scrennmatch.exercicios;

public class ConversorTemperaturaTeste {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(25);
        conversor.fahrenheitParaCelsius(72);
    }
}
