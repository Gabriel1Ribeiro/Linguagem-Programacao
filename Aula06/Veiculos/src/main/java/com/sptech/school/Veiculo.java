package com.sptech.school;

abstract class Veiculo {
    String nome;
    public Veiculo(String nome) {
        this.nome = nome;
    }

    public void ligar(){
        System.out.println("Ligado");
    }
    public abstract void mover();
}
