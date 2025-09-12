package com.sptech.school;

public class CarroEletrico extends Veiculo implements Eletrico{
    public CarroEletrico(String nome) {
        super(nome);
    }
    @Override
    public void mover(){
        System.out.println(nome + " está se movendo pelas ruas");
    }
    @Override
    public void carregarBateria(){
        System.out.println(nome + " está carregando a bateria na tomada");
    }

}
