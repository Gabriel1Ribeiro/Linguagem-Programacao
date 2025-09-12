package com.sptech.school;

public class Carro {
    // Classe carro (Composição: Carro TEM um motor e que só existe dentro do carro)
    private String marca, modelo;
    private Motor motor; // Composição

    public Carro(String marca, String modelo, int potenciaMotor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor(potenciaMotor);
        // O Motor é criado JUNTO com o carro

    }
    public void ligarCarro() {
        System.out.println("Ligando carro: " + this.modelo);
        motor.ligar();
    }

    public void desligarCarro() {
        System.out.println("Desligando carro: " + this.modelo);
        motor.desligar();
    }


}
