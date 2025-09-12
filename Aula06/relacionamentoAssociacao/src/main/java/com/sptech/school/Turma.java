package com.sptech.school;

public class Turma {
  private String nomeTurma;
  private Professor professor; // Associação: Turma TEM um professor

  public Turma(String nomeTurma, Professor professor) {
      this.nomeTurma = nomeTurma;
      this.professor = professor;
  }

  public void exibirDetalhes(){
      System.out.println("Nome: " + this.nomeTurma);
      if (this.professor != null){
          System.out.println("Professor: " + this.professor.getNome());
      }else {
          System.out.println("Sem professor associado");
      }
  }
}
