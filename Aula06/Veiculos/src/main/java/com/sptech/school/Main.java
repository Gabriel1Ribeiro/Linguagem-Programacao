package com.sptech.school;

public class Main {
    public static void main(String[] args) {
        Veiculo tesla = new CarroEletrico("Tesla1");
        Veiculo bike = new Bicicleta("Birroz");

        tesla.ligar();
        tesla.mover();
        // Carregar a bateria do Carro
        ((CarroEletrico)tesla).carregarBateria();

        System.out.println("-------------------------------------------");
        bike.ligar();
        bike.mover();
    }
}
