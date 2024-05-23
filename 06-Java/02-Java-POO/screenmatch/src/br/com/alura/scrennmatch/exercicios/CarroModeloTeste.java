package br.com.alura.scrennmatch.exercicios;

public class CarroModeloTeste extends CarroModeloSuper {
    public static void main(String[] args) {

        CarroModeloTeste meuCarro = new CarroModeloTeste();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();

    }

}
