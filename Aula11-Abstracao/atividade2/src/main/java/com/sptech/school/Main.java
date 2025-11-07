package com.sptech.school;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Uno");
        Moto moto = new Moto("Harley Davison", "Cruise");

        System.out.println(carro.getDescricao());
        System.out.println(carro.calcularAluguel(30));
        System.out.println(moto.getDescricao());
        System.out.println(moto.calcularAluguel(50));
    }
}
