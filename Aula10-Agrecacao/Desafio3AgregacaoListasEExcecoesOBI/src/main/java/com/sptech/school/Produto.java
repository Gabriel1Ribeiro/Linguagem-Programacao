package com.sptech.school;

import java.util.LinkedHashMap;

public class Produto {
    private String nome;
    private double preco;
    private String categoria;

    public String getCategoria() {return categoria;}
    public void setCategoria(String categoria) {this.categoria = categoria;}
    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return nome + " -R$ " + preco + " (" + categoria + ")";
    }
}
