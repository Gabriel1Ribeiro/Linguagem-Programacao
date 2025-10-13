package com.sptech.school;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(3000, "Gabriel", false, true, 10.0, 0.0);
        Aluno aluno2 = new Aluno(3422, "Carlos", true, true, 9.0, 9.0);
        Aluno aluno3 = new Aluno(6433, "Henrique", false, false, 2.0, 7.0);

        Secretaria secretaria = new Secretaria();
        secretaria.registraPagamento(aluno1);
        secretaria.registraAtrasoPag(aluno2);
        secretaria.registraCancelamento(aluno3);
        secretaria.verificaAprovacaoAluno(aluno1);
        secretaria.verificaAprovacaoAluno(aluno2);
        secretaria.verificaAprovacaoAluno(aluno3);
        secretaria.exibirRelatorio();
    }
}
