package com.sptech.school;

public class Main {
    public static void main(String[] args) {
        // Criar carro com o Motor
        Carro carro1 = new Carro("Fiat", "FastBack", 1250);
        carro1.ligarCarro();
        carro1.desligarCarro();
    }
}
