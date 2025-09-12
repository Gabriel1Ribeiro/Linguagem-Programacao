package com.sptech.school;

public class Turma {
    private String nomeTurma;
    private Professor professor;

    public Turma(String nomeTurma, Professor professor){
        this.nomeTurma = nomeTurma;
        this.professor = professor;
    }

    public void aparecer() {
        if(professor != null) {
            System.out.println("O professor " + this.professor.getNome() + " Pertence a turma " + nomeTurma);
        }else {
            System.out.println("A turma " + nomeTurma + " não possui um professor");
        }
    }


}
