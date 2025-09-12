package com.sptech.scool;

public class Main {
    public static void main(String[] args) {
        // Usando as interfaces criadas
        Pagamento p1 = new CartaoCredito();
        Pagamento p2 = new Boleto();

        p1.pagar(250.00);
        p1.recibo(250.00);

        p2.pagar(350.00);
        p2.recibo(350.00);
    }
}
