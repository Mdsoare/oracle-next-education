package br.com.alura.scrennmatch.exercicios;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double temperaturaEmFahrenheit;
        temperaturaEmFahrenheit = (celsius * 1.8) + 32;
        System.out.println(
                String.format("A temperatura de %.1fº Celsius equivale a %.1fº Fahrenheit", celsius,
                        temperaturaEmFahrenheit));
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double temperaturaEmCelsius;
        temperaturaEmCelsius = (fahrenheit - 32) * (5.0 / 9.0);
        System.out.println(String.format("A temperatura de %.1fº Fahrenheit é equivalente a %.1fº Celsius", fahrenheit,
                temperaturaEmCelsius));
    }
}
