package com.sptech.school;

public class Livro {
    String codigo;
    String nome;
    String autor;
    Integer quantidadePaginas;

    public Livro(String codigo, String nome, String autor, Integer quantidadePaginas) {
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.quantidadePaginas = quantidadePaginas;
    }

    public Double calcularPeso() {
        return quantidadePaginas * 2.4;
    }
}
