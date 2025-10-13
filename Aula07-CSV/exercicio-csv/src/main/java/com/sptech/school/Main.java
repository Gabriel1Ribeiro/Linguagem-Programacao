package com.sptech.school;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tema tema1 = new Tema(1, "cam32", 54.22, 10, true, true, 70.00);
        Tema tema2 = new Tema(2, "cam64", 32.50, 8, false, true, 65.00);
        Tema tema3 = new Tema(3, "camHD", 75.00, 12, true, false, 80.50);
        Tema tema4 = new Tema(4, "cam4K", 90.10, 16, true, true, 95.75);
        Tema tema5 = new Tema(5, "camNight", 20.30, 6, false, false, 50.20);
        Tema tema6 = new Tema(6, "camOutdoor", 60.00, 14, true, true, 85.60);
        Tema tema7 = new Tema(7, "camIndoor", 45.75, 9, false, true, 72.30);
        Tema tema8 = new Tema(8, "camMini", 15.90, 4, true, false, 40.00);

        List<Tema> lista = new ArrayList<>();
        lista.add(tema1);
        lista.add(tema2);
        lista.add(tema3);
        lista.add(tema4);
        lista.add(tema5);
        lista.add(tema6);
        lista.add(tema7);
        lista.add(tema8);

        String caminho = "dados_cameras.csv";

        try {
            File arquivo = new File(caminho);
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso! " + arquivo.getAbsolutePath());
            } else {
                System.out.println("Arquivo já existe! " + arquivo.getAbsolutePath());
            }

            FileWriter writer = new FileWriter(arquivo);
            writer.write("id,modeloCamera,quantRede,quantCamera,ligado,limiteRede,quantCPU\n");

            for (Tema t : lista) {

                writer.write(t.getId() + "," + t.getModeloCamera() + "," + t.getQuantRede() + ","
                        + t.getQuantCamera() + "," + t.isLigado() + "," + t.isLimiteRede() + ","
                        + t.getQuantCPU() + "\n");
            }

            writer.close();
            System.out.println("Dados inseridos com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo! " + e);
        }
    }
}
