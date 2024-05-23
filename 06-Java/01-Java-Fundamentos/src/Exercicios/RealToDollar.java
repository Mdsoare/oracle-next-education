package Exercicios;

public class RealToDollar {
    public static void main(String[] args) {
        double real = 100.50;
        double valorEmDolar = real * 4.94;
        System.out.println(String.format("O montante %.2f Reais é o equivalente a %.2f Dolares", real, valorEmDolar));
    }
}
