package com.sptech.school;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploUsuario {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero;

        try {
            System.out.print("Digite um numero inteiro: ");
            numero = entrada.nextInt(); // pode gerar uma Exceção
            System.out.println("Você digitou o número: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Era esperado um número inteiro" + e);
        } finally {
            System.out.println("Fim do programa");
            entrada.close();
        }

    }
}
