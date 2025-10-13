package com.sptech.school;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String caminhoEntrada = "src/data/entrada.csv";
        String caminhoSaida = "src/data/saida.csv";
        try (
            // Foi colocado como parametro, para dizer "Cria esses caras aqui antes de fazer
            // qualquer coisa"
            Scanner sc = new Scanner(new File(caminhoEntrada));
            FileWriter writer = new FileWriter(caminhoSaida);
            ){
            System.out.println("Conteúdo do arquivo de entrada");
            while (sc.hasNextLine()) { // Enquanto existir algo na linha, ele continua
                String linha = sc.nextLine();
                System.out.println(linha);

                //Escrever no arquivo de Saída
                writer.write(linha + "\n");
            }
        }catch(FileNotFoundException e) {
            System.out.println("Arquivo de entrada não encontrado");
        }catch (IOException e) {
            System.out.println("Não possível escrever no arquivo de saída");
        }catch (SecurityException e) {
            System.out.println("Permissão negada para acessar ou modificar o arquivo." + e);
        }catch (Exception e) {
            System.out.println("Erro inesperado: " + e);
        }
    }
}
