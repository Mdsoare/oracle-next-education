import java.util.ArrayList;

import br.com.alura.scrennmatch.modelos.Titulo;
import br.com.alura.scrennmatch.modelos.Filme;
import br.com.alura.scrennmatch.modelos.Serie;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme filme1 = new Filme("The Matrix", 1999);
        filme1.avalia(9);
        Filme filme2 = new Filme("O Poderoso Chefão", 1970);
        filme2.avalia(6);
        Filme filme3 = new Filme("Dogville", 2003);
        filme3.avalia(10);
        Serie serie1 = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            try {
                Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            } catch (Exception e) {
                System.out.println("Erro ao tentar definir uma série como filme!"); //+ e.getMessage());
            }

        }
    }

}
