package com.sptech.school;

public class Aluno {
    int ra;
    String nome;
    boolean ativo;
    boolean inadimplente;
    int nota1;
    int nota2;

    public void calcularMedia(nota1, nota2) {
        int media = (nota1 * 0.4) + (nota2 * 0.6);
    }
    public Aluno() {

    }
}
