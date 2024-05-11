package Exercicios;

public class ProdutoXPreco {
    public static void main(String[] args) {
        double precoProduto = 29.99;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println(String.format("O valor total é de %.2f", valorTotal));
    }
}
