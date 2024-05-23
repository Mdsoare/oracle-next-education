package br.com.alura.scrennmatch.exercicios;

public class CarroFichaTecnicaTeste {
    public static void main(String[] args) {
        System.out.println("\nInstanciando a classe Carro");
        CarroFichaTecnica carro = new CarroFichaTecnica();
        carro.modelo = "Palio Attrative 1.4";
        carro.cor = "Vermelha";
        carro.ano = 2013;
        carro.exibeFichaTecnica();
        carro.exibeAnoDoCarro();
    }
}
