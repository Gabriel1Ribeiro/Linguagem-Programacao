package com.sptech.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Streaming {
    public List<Filme> filmes;

    public Streaming() {
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void removerFilme(Integer id) {
        filmes.removeIf(filme -> filme.id.equals(id));
    }

    public Integer getQuantidadeDeFilmes() {
        return filmes.size();
    }

    public Double getMediaFilmes() {
        if (filmes.isEmpty()) return 0.0;

        double soma = 0.0;
        for (Filme filme : filmes) {
            soma += filme.notaImdb;
        }
        return soma / filmes.size();
    }

    public Filme getFilmePeloNome(String nome) {
        for (Filme filme : filmes) {
            if (filme.nome.equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        return null;
    }

    public List<Filme> getFilmesPorCategoria(String categoria) {
        List<Filme> encontrados = new ArrayList<>();
        for (Filme filme : filmes) {
            if (filme.categoria.equalsIgnoreCase(categoria)) {
                encontrados.add(filme);
            }
        }
        return encontrados;
    }

    public Filme getFilmeMaiorNota() {
        if (filmes.isEmpty()) return null;

        Filme melhor = filmes.get(0);
        for (Filme filme : filmes) {
            if (filme.notaImdb > melhor.notaImdb) {
                melhor = filme;
            }
        }
        return melhor;
    }

    public Filme sortearFilme() {
        if (filmes.isEmpty()) return null;

        Random random = new Random();
        int indice = random.nextInt(filmes.size());
        return filmes.get(indice);
    }
}
