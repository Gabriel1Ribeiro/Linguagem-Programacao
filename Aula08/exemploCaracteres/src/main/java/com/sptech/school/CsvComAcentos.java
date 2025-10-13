package com.sptech.school;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CsvComAcentos {
    public static void main(String[] args) {
        String nomeArquivo = "src/dados.csv";
        // Para criar o arquivo
        escreverCsv(nomeArquivo);

        //Ler e exibir arquivo CSV
        lerCsv(nomeArquivo);
    }

    private static void lerCsv(String nomeArquivo) {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(nomeArquivo), StandardCharsets.UTF_8))) {
        String linha;
            System.out.println("Conteúdo do arquivo: " + nomeArquivo);

        while ((linha = reader.readLine())!=null){
                System.out.println(linha);
            }
        }catch (IOException e) {
            System.out.println("Erro ao ler o arquivo");
        }
    }

    private static void escreverCsv(String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(nomeArquivo), StandardCharsets.UTF_8))){

            writer.write("Nome,Profissão,Cidade");
            writer.write("\n");
            writer.write("José da Silva,Engenheiro,Camapuã");
            writer.write("\n");
            writer.write("Márica Lemos,Professora,Belém");
            writer.write("\n");
            writer.write("André Souza,Médico,São Paulo");
            System.out.println("Arquivo criado com sucesso");
        }catch (IOException e) {
            System.out.println("Erro ao criar o arquivo!" + e);
        }
    }
}
