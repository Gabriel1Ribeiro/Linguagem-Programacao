package com.sptech.school;

abstract class Animal {
    String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    // Método concreto
    public void dormir() {
        System.out.println(nome + " está dormindo...");
    }

    // Método abstrato (sem impletação)
    // Todas as classes filhas terão obrigatóriamente que implementá-las
    public abstract void fazerSom();
}
