package com.sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {
    List<Livro> livros;
    Integer limite;
    Double peso;

    public Prateleira(Integer limite, Double peso) {
        this.livros = new ArrayList<>();
        this.limite = limite;
        this.peso = peso;
    }

    public void adicionarLivro(Livro livro) {
        if (livros.size() < limite) {
            livros.add(livro);
        } else {
            System.out.println("Limite de livros atingido. Não foi possível adicionar: " + livro.nome);
        }
    }

    public void removerLivro(String codigo) {
        livros.removeIf(livro -> livro.codigo.equalsIgnoreCase(codigo));    }

    public Integer quantidadeLivros() {
        return livros.toArray().length;
    }

    public Double getPesoTotal() {
        double pesoTotal = peso;
        for (Livro livro : livros) {
            pesoTotal += livro.calcularPeso();
        }
        return pesoTotal;
    }

    public Livro getLivroPorNome(String nome) {
        for (Livro livro : livros) {
            if (livro.nome.equalsIgnoreCase(nome)) {
                return livro;
            }
        }
        return null;
    }
}
