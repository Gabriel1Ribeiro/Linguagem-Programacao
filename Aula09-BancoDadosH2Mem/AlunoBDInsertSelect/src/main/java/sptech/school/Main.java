package sptech.school;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Inciar a conexão
        AlunoBD alunoBD = new AlunoBD();

        //Inserir alguns alunos
        alunoBD.inserir(new Aluno("Maria",20));
        alunoBD.inserir(new Aluno("João",22));
        alunoBD.inserir(new Aluno("Ana",19));

        //Listar
        List<Aluno> lista = alunoBD.listar();
        System.out.println("Lista de alunos: ");
        for (Aluno aluno : lista) {
            System.out.println(aluno);
        }

        alunoBD.fechar();

    }
}
