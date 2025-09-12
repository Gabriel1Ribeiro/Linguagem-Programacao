package com.sptech.school;

public class vetores {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();

        int[] valorCompra = new int[15];
        String[] nomeCliente = new String[15];

        valorCompra[0] = 100;
        valorCompra[1] = 10000;
        valorCompra[2] = 100;
        valorCompra[3] = 10000;
        valorCompra[4] = 10;
        valorCompra[5] = 100000;
        valorCompra[6] = 200;
        valorCompra[7] = 342;
        valorCompra[8] = 5235;
        valorCompra[9] = 5235;
        valorCompra[10] = 74336;
        valorCompra[11] = 33;
        valorCompra[12] = 825;
        valorCompra[13] = 5453;
        valorCompra[14] = 34326;

        nomeCliente[0] = "A";
        nomeCliente[1] = "B";
        nomeCliente[2] = "C";
        nomeCliente[3] = "D";
        nomeCliente[4] = "E";
        nomeCliente[5] = "F";
        nomeCliente[6] = "G";
        nomeCliente[7] = "H";
        nomeCliente[8] = "I";
        nomeCliente[9] = "J";
        nomeCliente[10] = "K";
        nomeCliente[11] = "L";
        nomeCliente[12] = "M";
        nomeCliente[13] = "N";
        nomeCliente[14] = "O";

        for(int i = 0; i <= 14; i++) {
            int valor = valorCompra[i];
            System.out.print("Valor inserido: R$"  + valor);
            if(valor < 1000) {
                valor *= 0.90;
                System.out.print(" |  Você recebeu 10% de desconto");
            }else {
                valor *= 0.85;
                System.out.print(" |  Você recebeu 15% de desconto");

            }

            System.out.print(" |  Nome do clinte: " + nomeCliente[i]);
            System.out.println(" |  Valor total: R$" + valor);
        }

        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - inicio) + " ms");
    }
}
