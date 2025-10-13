package sptech.school;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoBD {
    private Connection conn;

    //Construtor
    public AlunoBD() {
        try {
            //URL de conexão com Banco de dados H2
            //Driver usado-> jdbc:h2:mem: nomeBanco
            String url = "jdbc:h2:mem:testdb";
            //Configurar o usuário de acesso
            String user = "sa";
            String password = "";
            //1-Criar a conexão
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("BAnco de Dados conectado com sucesso!");
            //2- Criar um objeto para executar as consultas
            Statement stmt = conn.createStatement();
            //3- criar uma tabela
            String sqlCreate = "CREATE TABLE ALUNOS (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nome VARCHAR(100)," +
                    "idade INT)";
            stmt.execute(sqlCreate);
            this.conn = conn;
            System.out.println("Tabela criada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        // Método para inserir
        public void inserir(Aluno aluno){
            try{
                //4- Inserir alguns registros
                String sql ="INSERT INTO alunos (nome, idade) VALUES (?,?)";
                PreparedStatement smt = conn.prepareStatement(sql);
                smt.setString(1, aluno.getNome());
                smt.setInt(2, aluno.getIdade());
                smt.executeUpdate();
                smt.close();
                System.out.println("Registros inseridos com sucesso!");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Erro ao inserir aluno!");
            }
        }

        //Método Listar
    public List<Aluno> listar(){
        List<Aluno> alunos = new ArrayList<Aluno>();
        try{
            //5 - Consulta
            String sqlSelect = "SELECT * FROM alunos";
            ResultSet rs = conn.createStatement().executeQuery(sqlSelect);
            System.out.println("Registros selecionados: ");
            while (rs.next()){
                Aluno aluno = new Aluno(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getInt("idade")
                );
                alunos.add(aluno);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar alunos!");
        }
        return alunos;
    }

    //Método para fechar a conexão
    public void fechar(){
        try {
            if(conn != null && !conn.isClosed()){
                conn.close();
                System.out.println("Conexão fechada com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar Conexão!");
        }
    }
}

