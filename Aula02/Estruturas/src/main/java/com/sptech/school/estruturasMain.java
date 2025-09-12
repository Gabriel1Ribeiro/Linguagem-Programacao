package com.sptech.school;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class estruturasMain {
    // Colocamos o método 'void' para mostrar que não tem
    public static void main(String[] args) {

        /*
        // Instânciar é pegar um objeto e colocá-lo na memória
        //'System' fala que vai usar algo do sistema
        // O 'in' serve para mostrar que será algo interno
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        //String nome = leitor.next(); //Captura somente o 1° texto digitado
        String nome = leitor.nextLine(); //Captura toda linha
        System.out.println("Seu nome é: " + nome);

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt(); //Captura de valores inteiros
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite a sua altura: ");
        double altura = leitor.nextDouble();
        System.out.println("Sua altura é: " + altura);

        System.out.println("Digite o seu peso: ");
        double peso = leitor.nextDouble();
        System.out.println("Seu peso é: " + peso * altura);

        System.out.println("Digite o valor da sua mensalidade: ");
        float valorMensalidade = leitor.nextFloat();
        System.out.println("Seu valor da mensalidade: " + valorMensalidade);

        */

        //Capturar um número qualquer informado pelo usuário e calcular a tabuada deste número de 1 até 10
        // usando a estrutura "for", depois usando a estrutura "While" e por fim "Do While"

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número qualquer: ");
        int numero = leitor.nextInt();

       /*
        // Usando FOR
        System.out.println("Usando FOR");

        for(int i = 1; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Usando While
        System.out.println("Usando WHILE");

        int contador = 1;

        while(contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }

        // Usando Do While
        System.out.println("Usando DO WHILE");

        int cont = 1;

        do{
            System.out.println(numero + " x " + cont + " = " + (numero * cont));
            cont++;
        }while (cont <= 10);

        */

        for(int i = 0; i <= 20; i++) {
            if(i % 2 == 0) {
                System.out.println("O número: " + i + " é Par");
            }else {
                System.out.println("O número: " + i + " é Ímpart");
            }
        }

       // validar par ou ímpar enquanto o número digitado for diferente de 0

       while(numero != 0) {
           if(numero % 2 == 0) {
               System.out.println("O número: " + numero + " é Par");
               break;
           }
           System.out.println("Digite um número qualquer: ");
           numero = leitor.nextInt();
       }
    }
}
