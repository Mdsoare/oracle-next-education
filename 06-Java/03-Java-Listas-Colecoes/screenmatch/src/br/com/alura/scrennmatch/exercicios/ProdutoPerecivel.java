package br.com.alura.scrennmatch.exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoPerecivel extends Produto {
    protected Date dataValidade; 

    // Construtor
    public ProdutoPerecivel(String nome) {
        super(nome);
    }

    public void setValidade(String data) throws Exception {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            this.dataValidade = sdf.parse(data);
    }
}
