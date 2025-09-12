package com.sptech.school;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Gabriel";
        professor.telefone = "123123123";
//      professor.getDisciplica() = "123123123"; (Não daria certo, pois ele é privado)
        professor.getDisciplica();
        professor.setDisciplica("Matemática");
        System.out.println("Nome: " + professor.nome +
             "\nDisciplina: " + professor.getDisciplica());
    }
}
