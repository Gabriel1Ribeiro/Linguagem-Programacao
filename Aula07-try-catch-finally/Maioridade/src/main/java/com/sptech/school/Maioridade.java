package com.sptech.school;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tentativas = 0;
        boolean valido = false;

        while (tentativas < 3 && !valido) {
            try {
                System.out.println("Digite a sua idade: ");
                int idade = entrada.nextInt();
                    System.out.println("Cadastro realizado com sucesso ! Sua idade é: " + idade + " anos. \n");
                if (idade < 18) {
                    System.out.println("Atenção: Usuários menores de idade precisam de autorização dos responsáveis.\n");
                }
                valido = true;
            } catch (InputMismatchException e) {
                tentativas++;
                System.out.println("Erro: Você deve digitar apenas números inteiros.");
                entrada.nextLine();
            } finally {
                if (tentativas == 3) {
                    System.out.println("Número máximo de tentativas atingido. Tente novamente mais tarde.");
                }
                System.out.println("Operação finalizada. Obrigado por usar o sistema!");
            }
//            if(tentativas == 3) {
//                System.out.println("Número máximo de tentativas atingido. Tente novamente mais tarde.");
//            }
        }
    }
}
