package sptech.school;

//Classe de Dominio representa o Objeto Aluno
public class Aluno {
    private int id;
    private String nome;
    private int idade;

    // Construtor sem ID, usado para inserir
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    //Criar um construtor completo, usar para recuperar as informações
    public Aluno(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }
    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return id + " - " + nome + " - " + idade + " anos";
    }
}
