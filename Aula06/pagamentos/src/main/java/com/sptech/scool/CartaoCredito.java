package com.sptech.scool;

public class CartaoCredito implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " Realizado com Cartão de Credito");
    }
}
