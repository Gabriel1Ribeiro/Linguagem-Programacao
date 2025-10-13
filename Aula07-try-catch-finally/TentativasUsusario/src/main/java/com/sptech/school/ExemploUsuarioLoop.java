package com.sptech.school;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExemploUsuarioLoop {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                    System.out.print("Digite um número inteiro: ");
                    numero = entrada.nextInt();
                    System.out.println("Digitou o número: " + numero);
                    valido = true;
            }catch(InputMismatchException e) {
                System.out.println("Deve ser informado um número inteiro.");
                entrada.nextLine();
            }finally {
                System.out.println("Sistema finalizado com sucesso!\n");
            }
        }

    }
}
