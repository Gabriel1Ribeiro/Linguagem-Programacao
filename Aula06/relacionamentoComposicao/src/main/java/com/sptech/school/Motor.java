package com.sptech.school;

public class Motor {
    private int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public void ligar(){
        System.out.println("Motor de: " + potencia + " ligado");
    }

    public void desligar(){
        System.out.println("Motor de: " + potencia + " desligado");
    }
}
