package com.sptech.school;

public class Secretaria {
     int totalInadimplentes;
     int totalCancelamentos;
     int totalPagamentos;

     public Secretaria() {
         totalInadimplentes = 0;
         totalCancelamentos = 0;
         totalPagamentos = 0;
     }

    public void registraPagamento(Aluno aluno) {
        aluno.inadimplente = false;
        totalPagamentos++;
        System.out.println("O aluno " + aluno.nome + " de RA " + aluno.ra + " está em dia com o pagamento.");
    }

    public void registraAtrasoPag(Aluno aluno) {
        aluno.inadimplente = true;
        totalInadimplentes++;
        System.out.println("O aluno " + aluno.nome + " de RA " + aluno.ra + " está inadimplente.");
    }

    public void registraCancelamento(Aluno aluno) {
        aluno.ativo = false;
        totalCancelamentos++;
        System.out.println("O aluno " + aluno.nome + " de RA " + aluno.ra + " cancelou a matrícula.");
    }

    public void verificaAprovacaoAluno(Aluno aluno) {
         double media = aluno.calcularMedia();
         String status;
        if (media >= 6) {
            status = "Aprovado";
        }else{
            status = "Reprovado";
        }

        boolean situacaoAluno = aluno.ativo;
        String resultadoSituacao;

        if(situacaoAluno == true) {
            resultadoSituacao = "ATIVO";
        }else{
            resultadoSituacao = "INATIVO";
        }

        boolean inadimplencia = aluno.inadimplente;
        String resultadoInadi;

        if(inadimplencia == true) {
            resultadoInadi = "SIM";
        }else{
            resultadoInadi = "NÃO";
        }
        System.out.println("\n--------------------------------------");
        System.out.println("SITUAÇÃO DO ALUNO ->" + resultadoSituacao);
        System.out.println("RA: " + aluno.ra);
        System.out.println("Nome: " + aluno.nome);
        System.out.println("Nota 1: " + aluno.nota1);
        System.out.println("Nota 2: " + aluno.nota2);
        System.out.println("Média: " + media);
        System.out.println("Status: " + status);
        System.out.println("Inadimplente: " + resultadoInadi);
        System.out.println("-------------------------------------- \n");
    }

    public void exibirRelatorio(){
        System.out.println("------------- RELATÓRIO -------------");
        System.out.println("Pagamentos realizados: " + totalPagamentos);
        System.out.println("Inadimplentes: " + totalInadimplentes);
        System.out.println("Evasões: " + totalCancelamentos);
    }
}
