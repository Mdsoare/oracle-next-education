package br.com.alura.scrennmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpsodio;
    private boolean ativa;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    /**
     * @return int return the temporadas
     */
    public int getTemporadas() {
        return this.temporadas;
    }

    /**
     * @param temporadas the temporadas to set
     */
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    /**
     * @return int return the episodiosPorTemporada
     */
    public int getEpisodiosPorTemporada() {
        return this.episodiosPorTemporada;
    }

    /**
     * @param episodiosPorTemporada the episodiosPorTemporada to set
     */
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    /**
     * @return int return the minutosPorEpsodio
     */
    public int getMinutosPorEpsodio() {
        return this.minutosPorEpsodio;
    }

    /**
     * @param minutosPorEpsodio the minutosPorEpsodio to set
     */
    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }

    /**
     * @return boolean return the ativa
     */
    public boolean isAtiva() {
        return this.ativa;
    }

    /**
     * @param ativa the ativa to set
     */
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return this.temporadas * this.episodiosPorTemporada * this.minutosPorEpsodio;
    }
}
