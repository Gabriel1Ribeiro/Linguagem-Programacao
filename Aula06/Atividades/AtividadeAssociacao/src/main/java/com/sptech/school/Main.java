package com.sptech.school;

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Gabriel");

        Turma turma1 = new Turma("Galvão Bueno", prof1);
        turma1.aparecer();
    }
}
