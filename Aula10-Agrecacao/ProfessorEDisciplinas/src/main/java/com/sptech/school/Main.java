package com.sptech.school;

public class Main {
    public static void main(String[] args) {
        // Criar disciplinas que podem existir independente do professor
        Disciplina d1 = new Disciplina("LP", 60);
        Disciplina d2 = new Disciplina("SO", 40);
        Disciplina d3 = new Disciplina("BD", 80);

        // Criar professor
            Professor prof1 = new Professor("José");

        // Associar disciplinas ao professor
        prof1.adicionarDisciplina(d1);
            prof1.adicionarDisciplina(d2);

        // Listar disciplinas do professor
        prof1.ListDisciplinas();

        System.out.println("Disciplinas independentes: ");

    }
}
