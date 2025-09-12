package com.sptech.school;

public class Main {
    public static void main(String[] args) {
        // Não podemos intanciar a classe Animal, pois é abstrato
        Animal dog = new Cachorro("Binho");
        Animal cat = new Gato("Xaysha");

        System.out.println("Cachorro");
        dog.dormir();
        dog.fazerSom();

        System.out.println("Gato");
        cat.dormir();
        cat.fazerSom();
    }
}
