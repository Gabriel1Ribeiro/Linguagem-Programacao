package com.sptech.school;

public class Bicicleta extends Veiculo{
    public Bicicleta(String nome) {
        super(nome);
    }

    @Override
    public void mover(){
        System.out.println(nome+ " está sendo pedalada");
    }
}
