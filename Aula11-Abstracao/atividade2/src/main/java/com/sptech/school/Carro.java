package com.sptech.school;

public class Carro extends Veiculo{
    public Carro(String marca, String modelo) {
        super(modelo, marca);
    }
    @Override
    public double calcularAluguel(int dias) {
        return 100.0 * dias;
    }
}
