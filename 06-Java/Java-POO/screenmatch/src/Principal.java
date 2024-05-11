import br.com.alura.scrennmatch.calculos.CalculadoraDeTempo;
import br.com.alura.scrennmatch.calculos.FiltroRecomendacao;
import br.com.alura.scrennmatch.modelos.Episodio;
import br.com.alura.scrennmatch.modelos.Filme;
import br.com.alura.scrennmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n######### Filme #########");
        Filme filme1 = new Filme();
        filme1.setNome("The Matrix");
        filme1.setAnoDeLancamento(1999);
        filme1.setDuracaoEmMinutos(135);
        filme1.setIncluidoNoPlano(true);
        filme1.exibeFichaTecnica();
        filme1.avalia(9);
        filme1.avalia(5);
        filme1.avalia(9);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println(String.format("Média de avaliações do filme: %.2f", filme1.pegaMedia()));
        System.out.println("Duração do Filme: " + filme1.getDuracaoEmMinutos());

        System.out.println("\n######### Filme #########");
        Filme filme2 = new Filme();
        filme2.setNome("O Poderoso Chefão");
        filme2.setAnoDeLancamento(1970);
        filme2.setDuracaoEmMinutos(180);
        filme2.setIncluidoNoPlano(true);

        System.out.println("\n######### Série #########");
        Serie serie1 = new Serie();
        serie1.setNome("Lost");
        serie1.setAnoDeLancamento(2000);
        serie1.exibeFichaTecnica();
        serie1.setTemporadas(10);
        serie1.setEpisodiosPorTemporada(10);
        serie1.setMinutosPorEpsodio(50);
        System.out.println("Duração para maratora a Série: " + serie1.getDuracaoEmMinutos());

        System.out.println("\n######### Calculadora #########");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println(calculadora.getTempoTotal());

        System.out.println("\n######### Filtro de recomendação #########");
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        System.out.println("\n######### Episodio #########");
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}