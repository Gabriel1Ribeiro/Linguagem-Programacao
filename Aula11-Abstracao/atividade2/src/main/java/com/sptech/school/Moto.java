package com.sptech.school;

public class Moto extends Veiculo {
    public Moto (String marca, String modelo){
        super(modelo, marca);

    }
    @Override
    public double calcularAluguel(int dias) {
        return 50.0 * dias;
    }
}
