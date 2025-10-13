package com.sptech.school;

public class MainFilmeStream {
    public static void main(String[] args) {
        Streaming streaming = new Streaming();

        Filme filme1 = new Filme(1, "Arroz com ovo 2", "Ação", 10.0);
        Filme filme2 = new Filme(2, "O Poderoso Chefinho", "Comédia", 7.0);
        Filme filme3 = new Filme(3, "Toy Story 9", "Animação", 8.5);
        Filme filme4 = new Filme(4, "Naruto: A história", "Animação", 0.0);

        streaming.adicionarFilme(filme1);
        streaming.adicionarFilme(filme2);
        streaming.adicionarFilme(filme3);
        streaming.adicionarFilme(filme4);

        System.out.println("Total de filmes: " + streaming.getQuantidadeDeFilmes());
        System.out.println("Média das notas: " + streaming.getMediaFilmes());

        Filme buscado = streaming.getFilmePeloNome("matrix");
        if (buscado != null) {
            System.out.println("Filme buscado: " + buscado.nome);
        } else {
            System.out.println("Filme não encontrado.");
        }

        Filme melhor = streaming.getFilmeMaiorNota();
        if (melhor != null) {
            System.out.println("Filme com maior nota: " + melhor.nome);
        } else {
            System.out.println("Nenhum filme disponível para avaliação.");
        }

        Filme sorteado = streaming.sortearFilme();
        if (sorteado != null) {
            System.out.println("Filme sorteado: " + sorteado.nome);
        } else {
            System.out.println("Nenhum filme disponível para sorteio.");
        }

        streaming.removerFilme(2);
        System.out.println("Total após remoção: " + streaming.getQuantidadeDeFilmes());
    }
}
