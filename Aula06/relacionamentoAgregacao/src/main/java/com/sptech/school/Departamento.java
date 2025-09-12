package com.sptech.school;
import java.util.ArrayList;
import java.util.List;

// Agregação: contém Professores
public class Departamento {
    private String nomeDepartamento;
    private List<Professor> professores; // Coleção de professores (agregação)

    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
        this.professores = new ArrayList<>();
    }
    // Método para adicionar professores ao departamento
    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    // Método para listar os detalhes do departamento
    public void exibirDetalhes() {
        System.out.println("Departamento: " + this.nomeDepartamento);
        for (Professor p: professores){
            System.out.println("Professor: " + p.getNome());
        }
    }
}
