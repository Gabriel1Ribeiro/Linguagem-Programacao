package com.sptech.school;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    // Getters
    public String getNome() {return nome;}
    public int getCargaHoraria() {return cargaHoraria;}

    // Setters
    public void setNome(String nome) {this.nome = nome;}
    public void setCargaHoraria(int cargaHoraria) {this.cargaHoraria = cargaHoraria;}

    // Construtor
    public Disciplina(String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nome + ", carga horária: " + cargaHoraria + "h";
    }

}


