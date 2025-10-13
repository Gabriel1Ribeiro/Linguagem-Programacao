package com.sptech.school;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private Connection conn;

    public BancoDeDados() {
        try {
            //URL de conexão com Banco de dados H2
            //Driver usado-> jdbc:h2:mem: nomeBanco
            String url = "jdbc:h2:mem:testdb";
            String user = "sa";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Banco conectado!");

            Statement stmt = conn.createStatement();
            String sqlCreate = "CREATE TABLE anime (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "genero VARCHAR(100)," +
                    "studio VARCHAR(100)," +
                    "qtd_episodio INT," +
                    "qtd_filme INT," +
                    "eh_original BOOLEAN," +
                    "ano_lancamento INT)";
            stmt.execute(sqlCreate);
            System.out.println("Tabela criada!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Inserir anime
    public void inserir(Anime anime) {
        try {
            String sql = "INSERT INTO anime (nome, genero, studio, qtd_episodio, qtd_filme, eh_original, ano_lancamento) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setString(1, anime.getNome());
            smt.setString(2, anime.getGenero());
            smt.setString(3, anime.getStudio());
            smt.setInt(4, anime.getQtdEpisodio());
            smt.setInt(5, anime.getQtdFilme());
            smt.setBoolean(6, anime.isEhOriginal());
            smt.setInt(7, anime.getAnoLancamento());
            smt.executeUpdate();
            smt.close();
            System.out.println("Anime inserido com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao inserir anime.");
        }
    }

    // Listar todos os animes
    public List<Anime> listar() {
        List<Anime> lista = new ArrayList<>();
        try {
            String sql = "SELECT * FROM anime";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                Anime anime = new Anime(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("genero"),
                        rs.getString("studio"),
                        rs.getInt("qtd_episodio"),
                        rs.getInt("qtd_filme"),
                        rs.getBoolean("eh_original"),
                        rs.getInt("ano_lancamento")
                );
                lista.add(anime);
            }
            System.out.println("Listagem concluída!");
        } catch (Exception e) {
            System.out.println("Erro ao listar animes.");
        }
        return lista;
    }

    // Atualizar anime
    public void atualizar(int id, String novoStudio, int novaQtdEpisodio) {
        try {
            String sql = "UPDATE anime SET studio = ?, qtd_episodio = ? WHERE id = ?";
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setString(1, novoStudio);
            smt.setInt(2, novaQtdEpisodio);
            smt.setInt(3, id);
            int linhas = smt.executeUpdate();
            smt.close();
            System.out.println(linhas > 0 ? "Anime atualizado com sucesso!" : "Anime não encontrado.");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar anime.");
        }
    }

    // Excluir anime
    public void excluir(int id) {
        try {
            String sql = "DELETE FROM anime WHERE id = ?";
            PreparedStatement smt = conn.prepareStatement(sql);
            smt.setInt(1, id);
            int linhas = smt.executeUpdate();
            smt.close();
            System.out.println(linhas > 0 ? "Anime excluído com sucesso!" : "Anime não encontrado.");
        } catch (Exception e) {
            System.out.println("Erro ao excluir anime.");
        }
    }

    // Fechar conexão
    public void fechar() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Conexão encerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar conexão!");
        }
    }
}
