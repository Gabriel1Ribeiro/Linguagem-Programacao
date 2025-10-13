package com.sptech.school;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    int ra;
    String nome;
    double nota;
    ArrayList<Double> notas = new ArrayList<>();
    int notasTotais;

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public void adicionarNota(double nota){
        notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

}
