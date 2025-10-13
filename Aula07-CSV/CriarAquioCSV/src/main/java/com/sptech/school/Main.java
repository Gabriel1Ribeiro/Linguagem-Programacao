package com.sptech.school;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String caminho = "novos_dados.csv"; //Aqui também poderia colocar o caminho de
        // qualquer lugar que você gostaria (ex: em uma pasta de trabalho ou pasta de "Documentos")

        try {
            File arquivo =  new File(caminho);
            // Criar somente se o arquivo não existir
            if(arquivo.createNewFile()){
                System.out.println("Arquivo criado com sucesso! " + arquivo.getAbsolutePath());
            }else {
                System.out.println("Arquivo não criado! " + arquivo);
            }
            // Escreva as informações
            FileWriter writer = new FileWriter(arquivo);
            writer.write("Nome,Idade,CEP\n");
            writer.write("Ana,32,03270-992\n");
            writer.write("Gabriel,42,53241-111\n");
            writer.close();
            System.out.println("Dados inseridos com sucesso!");
        }catch (IOException e){
            System.out.println("Erro ao criar arquivo! " + e);
        }
    }
}
