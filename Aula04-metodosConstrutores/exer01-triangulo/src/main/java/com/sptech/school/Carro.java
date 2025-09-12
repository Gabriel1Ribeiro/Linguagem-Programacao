package com.sptech.school;

public class Carro {
    String marca, modelo;
    int ano;
    float valorFipe;

    // Todos os métodos construtores aqui se chamam "Carro", ou outros são métodos comuns
    public Carro(){

    }

    public Carro(String marca){
        this.marca = marca;
    }

    public Carro(String m, float v){

    }

    public void imprimeDados(){

    }

    public float calcularValorVenda(float v) {
    return v;
    }
}
