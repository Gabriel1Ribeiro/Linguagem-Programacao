package com.sptech.school;

public class exemplo1 {
    public static void main(String[] args) {
        tabuada(5);
    }

    public static void tabuada(int num) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(num * i / 0);
            }
        } catch (Exception e) {
            // System.out.println(e);
            System.out.println("Erro: Divisão por zero");
        } finally {
            // System.out.println("Finalizado");
            mensagem();
        }
    }

    public static void mensagem() {
        System.out.println("Outro processamento");
        for (int x = 0; x < 10; x++) {
            System.out.println(x);
        }
        calcularidade(4);
    }

    public static void calcularidade(int num) throws IllegalArgumentException{
        if(num < 18) {
            System.out.println("Maior que 18");
        }else {
            throw new IllegalArgumentException("Menor que 18");
        }
    }

}
