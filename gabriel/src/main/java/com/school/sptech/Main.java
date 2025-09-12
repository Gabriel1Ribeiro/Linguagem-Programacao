package com.school.sptech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner notas = new Scanner(System.in);

        System.out.println("Digite a sua nota: ");
        int nota = notas.nextInt();

        System.out.println("Digite a sua frequência: ");
        int frequencia = notas.nextInt();

        if(nota < 0 || nota > 10) {
            System.out.println("A nota não pode ser abaixo de 0 ou acima de 10");
            return;
        }

        if(frequencia < 0 || frequencia > 100) {
            System.out.println("A frequência não pode ser abaixo de 0 ou acima de 100");
            return;
        }

        if(nota >= 0 && nota < 6) {
            System.out.println("Aluno ficou abaixo da média");
        }else if(nota >= 6 && nota <= 8) {
            System.out.println("Aluno ficou na média");
        }else if(nota > 8) {
            System.out.println("Aluno acima da média");
        }

        if(frequencia >= 75) {
            System.out.println("Aluno aprovado por frequência");
        }else {
            System.out.println("Aluno reprovado pro frequência");
        }


    }
}