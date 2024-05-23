package br.com.alura.scrennmatch.desafio;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes = 0;
    private int totalDeCurtidas = 0;
    private double classificacao = 0;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public double getDuracao() {
        return this.duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public void curtir() {
        this.totalDeCurtidas++;
        classificar();
    }

    public void reproduzir() {
        this.totalDeReproducoes++;
        classificar();
    }

    private void classificar() {
        if (totalDeReproducoes != 0) {
            this.classificacao = (double) totalDeCurtidas / totalDeReproducoes;
        }
    }

    public void getClassificacao() {

        if (this.classificacao == 0) {
            System.out.println("O título ainda não possui classificação!");
        } else if (this.classificacao > 0 && this.classificacao <= 0.2) {
            System.out.println("Classificação: Uma estrela");
        } else if (this.classificacao > 0.2 && this.classificacao <= 0.4){
            System.out.println("Classificação: Duas estrelas");
        } else if (this.classificacao > 0.4 && this.classificacao <= 0.6){
            System.out.println("Classificação: Três estrlas");
        } else if (this.classificacao > 0.6 && this.classificacao <= 0.8) {
            System.out.println("Classificação: Quatro estrelas");
        } else {
            System.out.println("Classificação: Cinco estrelas");
        }
    }
}