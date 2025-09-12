package com.sptech.scool;

public interface Pagamento {
    // Método asbtrato (todas as classes devem implementá-lo)
    void pagar(double valor);
    // Método default (opcional, já vem implementado)
    default void recibo(double valor){
        System.out.println("Recibo de R$" + valor);
    }
}
