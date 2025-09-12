package com.sptech.school;

public class Carro {
    String marca;
    int ano;
    String modelo;

    // Criando um objeto para ficar na memória
    public static void main(String[] args) {
        // o "new" é o que vai criar os objetos na memória
        Carro carro = new Carro();
        carro.marca = "Ford";
        carro.ano = 2015;
        carro.modelo = "Fusion";

        System.out.println(carro.marca);
        System.out.println(carro.ano);
        System.out.println(carro.modelo);

        // novo objeto
        Carro carro2 = new Carro();
        carro2.marca = "Fiat";
        carro2.ano = 2015;
        carro2.modelo = "Toro";
    }
}
