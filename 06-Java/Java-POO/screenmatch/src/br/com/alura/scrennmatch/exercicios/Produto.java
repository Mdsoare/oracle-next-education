package br.com.alura.scrennmatch.exercicios;

public class Produto {
    private String nomeDoProduto;
    private double precoDoProduto;
    //private double DESCONTO = 0.85;

    /**
     * @return String return the nomeDoProduto
     */
    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    /**
     * @param nomeDoProduto the nomeDoProduto to set
     */
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    /**
     * @return double return the precoDoProduto
     */
    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    /**
     * @param precoDoProduto the precoDoProduto to set
     */
    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public double aplicarDesconto(double desconto) {
        // return this.precoDoProduto * DESCONTO;
        return this.precoDoProduto - (desconto * this.precoDoProduto);
    }
}
