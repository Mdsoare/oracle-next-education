package br.com.alura.scrennmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
//import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    /**
     * @category Attribute Declaration
     */
    // @SerializedName("Title")
    private String nome;
    // @SerializedName("Year")
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasavaliacoes;
    private int totalDeAvaliacoes;

    // Constructor
    public Titulo(String nome, int anoDeLancamento) {
        this.setNome(nome);
        this.setAnoDeLancamento(anoDeLancamento);
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Falha na conversão do Ano por tem mais de 4 caracteres");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 3));
    }

    // GETTERS AND SETTERS
    /**
     * @return String return the nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the anoDeLancamento
     */
    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    /**
     * @param anoDeLancamento the anoDeLancamento to set
     */
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    /**
     * @return int return the duracaoEmMinutos
     */
    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    /**
     * @param duracaoEmMinutos the duracaoEmMinutos to set
     */
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    /**
     * @return boolean return the incluidoNoPlano
     */
    public boolean isIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    /**
     * @param incluidoNoPlano the incluidoNoPlano to set
     */
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    /**
     * @return double return the somaDasavaliacoes
     */
    public double getSomaDasavaliacoes() {
        return this.somaDasavaliacoes;
    }

    /**
     * @return int return the totalDeAvaliacoes
     */
    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }

    // Methods

    /**
     * @displays attributes of the class Filme through of the methods
     *           exibeFichaTecnica
     */
    public void exibeFichaTecnica() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano de Lançamento: " + this.anoDeLancamento);
        System.out.println("Duração: " + this.duracaoEmMinutos + " minutos");
        System.out.println("Incluído no plano: " + this.incluidoNoPlano);
    }

    /**
     * @param nota the avalia to set
     */
    public void avalia(double nota) {
        this.somaDasavaliacoes += nota;
        this.totalDeAvaliacoes++;
    }

    /**
     * @return double return the result of somaDasavaliacoes / totalDeAvaliacoes
     */
    public double pegaMedia() {
        if (this.totalDeAvaliacoes == 0) {
            throw new ArithmeticException("Divisão por zero. Nenhuma avaliação foi feita ainda.");
        } else {
            return this.somaDasavaliacoes / this.totalDeAvaliacoes;
        }
    }

    /**
     * @param somaDasavaliacoes the somaDasavaliacoes to set
     */
    public void setSomaDasavaliacoes(double somaDasavaliacoes) {
        this.somaDasavaliacoes = somaDasavaliacoes;
    }

    /**
     * @param totalDeAvaliacoes the totalDeAvaliacoes to set
     */
    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "( nome: " + this.getNome() + 
        ", ano de lançamento: " + this.getAnoDeLancamento() + ","
        + " duração em minutos: " + this.duracaoEmMinutos + ")";
    }
}
