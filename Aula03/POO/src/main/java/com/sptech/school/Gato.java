package com.sptech.school;

public class Gato {
    String cor;
    int idade;
    int vida;

    public static void main(String[] args) {
        testar();

    }

    public static void testar() {
        Gato gato = new Gato();
        gato.cor = "Vermelho";
        gato.idade = 12;
        gato.vida = 3;

        Gato gato2 = new Gato();

        gato2.cor = "Branco";
        gato2.idade = 6;
        gato2.vida = 1;

        System.out.println("Gato 1");
        System.out.println(gato.cor);
        System.out.println(gato.idade);
        System.out.println(gato.vida);

        System.out.println("\n");

        System.out.println("Gato 2");
        System.out.println(gato2.cor);
        System.out.println(gato2.idade);
        System.out.println(gato2.vida);
    }
}
