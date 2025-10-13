package com.sptech.school;


import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Disciplina> listDisciplinas;

    public Professor(String nome) {
        this.nome = nome;
        this.listDisciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.listDisciplinas.add(disciplina);
    }
    public void ListDisciplinas() {
        System.out.println("Lista de disciplinas do professor: ");
        for (Disciplina disciplina : this.listDisciplinas) {
            System.out.println(" - " + disciplina);
        }
    }
}
