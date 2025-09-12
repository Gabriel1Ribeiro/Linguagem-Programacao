package com.sptech.school;

public class vetores {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        numeros[1] = 20; // Posição 2 do índice
        numeros[3] = 50;

        System.out.println("O valor do índice 1 = " + numeros[0]);
        System.out.println("O valor do índice 1 = " + numeros[1]);
        System.out.println("O valor do índice 1 = " + numeros[2]);
        System.out.println("O valor do índice 2 = " + numeros[3]);
        System.out.println("O valor do índice 3 = " + numeros[4]);

        System.out.println("Usando for");

        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Índice: " + i + " - valor: " + numeros[i]);
        }

    }
}
