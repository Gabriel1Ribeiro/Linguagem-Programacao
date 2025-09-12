package com.sptech.school;
import java.util.Scanner;

public class aulaMetodos {
    public static void main(String[] args) {
        mensagem();
        solicitarNumero();
        int valor = solicitarValor();
        System.out.println("Valor: " + valor);
        calcularTabuada(valor);
    }

    // Criar um método que exibe uma mensagem para o usuário
    public static void mensagem() {
        System.out.println("Bom dia!");
    }

    // Criar um método que solicita que o usuário informe um número
    public static void solicitarNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();
        System.out.println("O número digitado foi: " + numero);
    }

    // Criar um método que solicita que o usuário informe um número
    // e retornar o valor digitado
    public static int solicitarValor(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int numero = entrada.nextInt();
        return numero;
    }

    // Criar um método que mostra os valores da tabuada do número do valor digitado
    // no método anterior
    public static void calcularTabuada(int valor) {
        for(int i = 0; i <= 10; i++){
            System.out.println(valor + " x " + i + " = " + (valor*i));
        }
    }
}
