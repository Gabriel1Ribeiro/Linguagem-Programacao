package com.sptech.school;

import java.sql.Connection; // CONEXÃO COM O BANCO DE DADOS
import java.sql.DriverManager; // CONTROLE DE DRIVERS
import java.sql.ResultSet; //
import java.sql.Statement; // PREPARAR O QUE SERÁ CONSULTA ESTRUTURADA


public class Main {
    public static void main(String[] args) {
        // URL de conexão com o banco de dados H2
        // Driver usado->jdbc:h2:mem:nomeBanco
        String url = "jdbc:h2:mem:testedb";

        // Configurar o usuário de acesso
        String user = "sa";
        String password = "";

        try{
            // 1- Criar a conexão
            Connection conn = DriverManager.getConnection(url,user,password);
            System.out.println("Banco de dados conectado com sucesso!");

            // 2- Criar um objeto para executar as consultas
            Statement stmt = conn.createStatement();

            // 3- Criar uma tabela
            String sqlCreate ="CREATE TABLE ALUNOS(" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "idade INT)";

            stmt.execute(sqlCreate);
            System.out.println("Tabela criada com sucesso!");

            // 4- Inserir alguns registros
            stmt.execute("INSERT INTO ALUNOS (nome, idade) VALUES ('Maria', 20)");
            stmt.execute("INSERT INTO ALUNOS (nome, idade) VALUES ('Gabriel', 27)");
            stmt.execute("INSERT INTO ALUNOS (nome, idade) VALUES ('Jonas', 45)");
            System.out.println("Registros inseridos com sucesso");

            // 5- Consulta
            String sqlSelect = "SELECT * FROM ALUNOS";
            ResultSet rs = stmt.executeQuery(sqlSelect);
            System.out.println("Registro selecionados");
            System.out.println(rs);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                System.out.println(id + " - " + nome + " - " + idade);
            }

            conn.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
