package com.sptech.school;

public class MainLivroPrat {
    public static void main(String[] args) {
        Livro livro1 = new Livro("D353", "LP", "GabrieL1", 120);
        Livro livro2 = new Livro("GA35", "BD", "GabrieL2", 200);
        Livro livro3 = new Livro("KLS4", "Algoritmos", "GabrieL3", 1000);
        Livro livro4 = new Livro("SG53", "IA", "GabrieL4", 180);

        Prateleira prateleira = new Prateleira(3, 500.0);

        prateleira.adicionarLivro(livro1);
        prateleira.adicionarLivro(livro2);
        prateleira.adicionarLivro(livro3);
        prateleira.adicionarLivro(livro4);

        System.out.println("Quantidade de livros: " + prateleira.quantidadeLivros());

        System.out.println("Peso total da prateleira: " + prateleira.getPesoTotal() + "g");

        Livro buscado = prateleira.getLivroPorNome("algoritmos");
        if (buscado != null) {
            System.out.println("Livro encontrado: " + buscado.nome + " - Autor: " + buscado.autor);
        } else {
            System.out.println("Livro não encontrado.");
        }

        prateleira.removerLivro("D353");
        System.out.println("Quantidade após remoção: " + prateleira.quantidadeLivros());


    }
}
