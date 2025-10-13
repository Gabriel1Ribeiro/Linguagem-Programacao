package com.sptech.school;

import java.util.ArrayList;

public class Turma {
    ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno getAlunoPorRa(int ra) {
        for (Aluno aluno : alunos) {
            if (aluno.ra == ra) {
                return aluno;
            }
        }
        return null;
    }

    public ArrayList<Aluno> getAlunoPorNome(String nomeBusca) {
        ArrayList<Aluno> resultado = new ArrayList<>();
        for (Aluno aluno : alunos) {
            if (aluno.nome.toLowerCase().contains(nomeBusca.toLowerCase())) {
                resultado.add(aluno);
            }
        }
        return resultado;
    }

    public Aluno getAlunoComMaiorMedia() {
        if (alunos.size() == 0) {
            return null;
        }

        Aluno maior = alunos.get(0);
        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() > maior.calcularMedia()) {
                maior = aluno;
            }
        }
        return maior;
    }

    public Aluno getAlunoComMenorMedia() {
        if (alunos.size() == 0) {
            return null;
        }

        Aluno menor = alunos.get(0);
        for (Aluno aluno : alunos) {
            if (aluno.calcularMedia() < menor.calcularMedia()) {
                menor = aluno;
            }
        }
        return menor;
    }

    public double calcularMediaDaTurma() {
        if (alunos.size() == 0) {
            return 0.0;
        }

        double soma = 0.0;
        for (Aluno aluno : alunos) {
            soma += aluno.calcularMedia();
        }

        return soma / alunos.size();
    }

    public double getMediaPorRa(int ra) {
        Aluno aluno = getAlunoPorRa(ra);
        if (aluno == null) {
            return 0.0;
        }

        return aluno.calcularMedia();
    }

    public double getMediana() {
        if (alunos.size() == 0) {
            return 0.0;
        }

        ArrayList<Double> medias = new ArrayList<>();
        for (Aluno aluno : alunos) {
            medias.add(aluno.calcularMedia());
        }

        int medidasSize = medias.size();

        // Bubble Sort que foi ensinado em aula
        for (int i = 0; i < medidasSize - 1; i++) {
            for (int j = i + 1; j < medidasSize; j++) {
                if (medias.get(i) > medias.get(j)) {
                    double temp = medias.get(i);
                    medias.set(i, medias.get(j));
                    medias.set(j, temp);
                }
            }
        }

        if (medidasSize % 2 == 1) {
            return medias.get(medidasSize / 2);
        } else {
            double meio1 = medias.get(medidasSize / 2 - 1);
            double meio2 = medias.get(medidasSize / 2);
            return (meio1 + meio2) / 2.0;
        }
    }
}
