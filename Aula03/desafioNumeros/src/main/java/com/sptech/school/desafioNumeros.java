package com.sptech.school;

import java.util.Scanner;

public class desafioNumeros {


    public static void main(String[] args) {
        int[] numeros = new int[10];
        digitarNumeros(numeros);
        pares(numeros);
        impares(numeros);
        soma(numeros);
        menu(numeros);
        somarPar(numeros);
    }

    public static void digitarNumeros(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite o " + (i + 1) + "° número: ");
            numeros[i] = leitura.nextInt();

        }
//        for(int j = 0; j < numeros.length; j++) {
//            System.out.println(numeros[j]);
//        }
    }

    public static void pares(int[] numeros) {
        System.out.println("Números pares: ");
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + ", ");
            }
        }
    }

    public static void impares(int[] numeros) {
        System.out.println("\nNúmeros ímpares: ");
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 1) {
                System.out.print(numeros[i] + ", ");
            }
        }
    }

    public static void soma(int[] numeros) {
        int soma = 0;
        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("\nSoma de todos os números: " +soma);
    }

    public static void menu(int[] numeros) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Escolha o número para um tipo cálculo: \n somar = 1 \n ímpares = 2 \n pares = 3");
        int numero = leitura.nextInt();

        if(numero == 1){
            soma(numeros);
        }else if(numero == 2){
            impares(numeros);
        }else if(numero == 3){
            pares(numeros);
        }
    }

    public static void somarPar(int[] numeros){
        int soma = 0;
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0){
                soma += numeros[i];
            }
        }
        System.out.println("Soma dos pares: " + soma);

    }

}

