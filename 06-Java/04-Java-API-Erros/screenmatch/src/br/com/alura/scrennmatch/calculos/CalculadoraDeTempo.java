package br.com.alura.scrennmatch.calculos;

// import br.com.alura.scrennmatch.modelos.Filme;
// import br.com.alura.scrennmatch.modelos.Serie;
import br.com.alura.scrennmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    // public void inclui(Filme f) {
    // this.tempoTotal += f.getDuracaoEmMinutos();
    // }
    // Sobrecarga de métodos - Mas há repetição de códigos!
    // public void inclui(Serie s) {
    // this.tempoTotal += s.getDuracaoEmMinutos();
    // }
    // Abaixo temos um exemplo de polimorfismo com a superclasse Titulo
    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos(); 
    }
}