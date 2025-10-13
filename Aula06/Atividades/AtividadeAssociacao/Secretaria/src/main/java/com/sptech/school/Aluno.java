package com.sptech.school;

public class Aluno {

    int ra;
    String nome;
    boolean ativo = true;
    boolean inadimplente = true;
    double nota1;
    double nota2;

    public Aluno(int ra, String nome, boolean ativo, boolean inadimplente, double nota1, double nota2) {
        this.ra = ra;
        this.nome = nome;
        this.ativo = ativo;
        this.inadimplente = inadimplente;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return nota1 * 0.4 + nota2 * 0.6;
    }

}
