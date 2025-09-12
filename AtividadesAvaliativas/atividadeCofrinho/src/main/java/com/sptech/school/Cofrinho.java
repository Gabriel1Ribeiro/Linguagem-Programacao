package com.sptech.school;
import java.util.Random;

public class Cofrinho {
    String dono;
    Double saldo = 0.0;
    Boolean quebrado = false;


    public void depositar(Double valor) {
        if(quebrado == false) {
            saldo += valor;
        }
    }

    public Double sacar(Double valor) {
        if(saldo >= valor && quebrado == false){
            saldo = saldo - valor;
        }
        return saldo;
    }

    public Double quebrar(){
        if(quebrado == true) {
            return 0.0;
        }
            return saldo;
    }

    public Double sacudir(){
        Random valor = new Random();
        Double valorAleartorio = valor.nextDouble();
        if(quebrado == true){
            return 0.0;
        }
        return saldo - valorAleartorio ;
    }

    public Boolean isMaiorQue(Cofrinho cofrinho){
        if(this.saldo > cofrinho.getSaldo()){
            return true;
        }
        return false;
    }

    public String getDono(){
        return dono;
    }

    public void setDono(String dono){
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Boolean getQuebrado(){
        if(quebrado == true){
        return true;
        }
        return false;
    }
}
