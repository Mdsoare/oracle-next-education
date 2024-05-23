package br.com.alura.scrennmatch.exercicios;

public class CalculoGeometricoSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double comprimento, double altura) {
        double area = comprimento * altura;
        System.out.println(String.format("A área do retângulo é %.2f", area));
    }

    @Override
    public void calcularPerimetro(double comprimento, double altura) {
        double perimetro = (comprimento + altura) * 2;
        System.out.println(String.format("O perímetro do retângulo é %.2f", perimetro));
    }
}
