package com.sptech.school;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class vetoresComScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        double valorCompras = 0.0;

        for(int i = 1; i < 15; i++) {
            System.out.println("Digite o nome: ");
            nome = sc.next();
            System.out.println("Digite o valor da compra: ");
            valorCompras = sc.nextDouble();
            if(valorCompras < 1000) {
                System.out.println("O Bônus é: " + valorCompras * 0.001);
            }else {
                System.out.println("O Bônus é: " + valorCompras * (15/100));
            }
        }
    }
}
