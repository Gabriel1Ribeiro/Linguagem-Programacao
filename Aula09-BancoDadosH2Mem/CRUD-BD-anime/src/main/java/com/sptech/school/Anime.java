package com.sptech.school;

public class Anime {
    private int id;
    private String nome;
    private String genero;
    private String studio;
    private int qtdEpisodio;
    private int qtdFilme;
    private boolean ehOriginal;
    private int anoLancamento;

    // Construtor para inserção
    public Anime(String nome, String genero, String studio, int qtdEpisodio, int qtdFilme, boolean ehOriginal, int anoLancamento) {
        this.nome = nome;
        this.genero = genero;
        this.studio = studio;
        this.qtdEpisodio = qtdEpisodio;
        this.qtdFilme = qtdFilme;
        this.ehOriginal = ehOriginal;
        this.anoLancamento = anoLancamento;
    }

    public Anime(int id, String nome, String genero, String studio, int qtdEpisodio, int qtdFilme, boolean ehOriginal, int anoLancamento) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.studio = studio;
        this.qtdEpisodio = qtdEpisodio;
        this.qtdFilme = qtdFilme;
        this.ehOriginal = ehOriginal;
        this.anoLancamento = anoLancamento;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getGenero() { return genero; }
    public String getStudio() { return studio; }
    public int getQtdEpisodio() { return qtdEpisodio; }
    public int getQtdFilme() { return qtdFilme; }
    public boolean isEhOriginal() { return ehOriginal; }
    public int getAnoLancamento() { return anoLancamento; }

    public void setId(int id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setStudio(String studio) { this.studio = studio; }
    public void setQtdEpisodio(int qtdEpisodio) { this.qtdEpisodio = qtdEpisodio; }
    public void setQtdFilme(int qtdFilme) { this.qtdFilme = qtdFilme; }
    public void setEhOriginal(boolean ehOriginal) { this.ehOriginal = ehOriginal; }
    public void setAnoLancamento(int anoLancamento) { this.anoLancamento = anoLancamento; }
}
