package br.com.alura.scrennmatch.exercicios;

public class TabuadaMultiplicacao implements TabuadaInterface {
    @Override
    public void mostrarTabuada(int numero) {
        System.out.println(String.format("Tabuada de multiplicação do %d:", numero));
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(String.format("%d X %d = %d", numero, i, resultado));
        }
    }
}
