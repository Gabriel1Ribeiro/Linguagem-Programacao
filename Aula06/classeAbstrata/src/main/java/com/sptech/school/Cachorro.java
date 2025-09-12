package com.sptech.school;

// Herda de animal
public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    // Implementar o método abstrato
    @Override
    public void fazerSom(){
        System.out.println(nome + " Au Au!!");
    }
}
