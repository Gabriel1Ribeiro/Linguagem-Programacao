package com.sptech.school;

public class Main {
    public static void main(String[] args) {
        // Criar professores

        Professor prof1 = new Professor("Gabriel Henrique");
        Professor prof2 = new Professor("Marize Maria");
        Professor prof3 = new Professor("Angelica Braga");

        // Criar um departamento
        Departamento depTI = new Departamento("Tecnologia");

        // Associação de professores ao departamento
        depTI.adicionarProfessor(prof1);
        depTI.adicionarProfessor(prof2);
        depTI.adicionarProfessor(prof3);

        // Exibir os detalhes do departamento
        depTI.exibirDetalhes();

        // Mesmo que o departamento não exista, consigo acessar um professor
        System.out.println("\nProfessor ainda existe: " + prof1.getNome());

    }
}
