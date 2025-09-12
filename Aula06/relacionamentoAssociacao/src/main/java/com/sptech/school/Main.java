package com.sptech.school;

public class Main {
    public static void main(String[] args) {
        // Criar um professor
        Professor prof1 = new Professor("Gabriel Varnado");

        // Criar uma turma associada a um professor
        Turma turma1 = new Turma("POO", prof1);
        turma1.exibirDetalhes();

        //Criando uma turma sem professor
        Turma turma2 = new Turma("Banco de dados", null);
        turma2.exibirDetalhes();
    }
}
