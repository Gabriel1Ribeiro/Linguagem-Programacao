package com.sptech.school;

public class matriz {
    public static void main(String[] args) {
        String alunos[][] =  new String[3][3];
        alunos[0][0] = "João";
        alunos[1][1] = "José";
        alunos[2][2] = "Manoel";
        for(int i = 0; i < alunos.length; i++){
            for(int j = 0; j < alunos.length; j++){
                System.out.print(alunos[i][j] + "");
            }
        }
    }
}
