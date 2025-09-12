package com.sptech.scool;

public class Boleto implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " Realizado no boleto");
    }
}
