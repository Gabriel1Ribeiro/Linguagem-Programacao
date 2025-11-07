package com.sptech.school;

abstract class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public abstract double calcularAluguel(int dias);

    public String getDescricao() {
        return marca + " " + modelo;
    }
}
