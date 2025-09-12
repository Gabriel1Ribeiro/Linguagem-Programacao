package com.sptech.school;

/* A Vila da Folha decidiu modernizar o cadastro de seus ninjas. A missão é sua: criar um sistema simples que ajude o Hokage a organizar essas informações, aplicando os conceitos de encapsulamento, getters e setters com validação.
Classe Ninja:
Atributos:
nome (String) → obrigatório, não pode ser vazio e nem nulo
chakra (Double) → deve ser maior que 0 e não pode ser nulo
rank (String) → obrigatório, não pode ser nulo e deve ser um dos seguintes valores: "Genin", "Chuunin", "Jounin" ou "Hokage".
Regras de negócio:
Caso um valor inválido seja informado, deve ser exibida uma mensagem de erro (ex.: "Rank inválido!").
Crie uma classe main para testar as validações. */


public class naruto {


    private String nome;
    private Double chakra;
    private String rank;


    public void naruto(){

    }
    public naruto(String nome, Double chakra, String rank) {
        this.nome = nome;
        this.chakra = chakra;
        this.rank = rank;
    }

    public naruto nomeRank(String nome, String rank, Double chakra) {
        if(nome == null || nome.equals("")){
            System.out.println("O nome está inválido");
            return null;
        }

        if (chakra == null || chakra < 0) {
            System.out.println("O chakra está inválido");
            return null;
        }

        boolean rankValido = true;

        if (rank == null) {
            System.out.println("O rank está inválido");
            return null;
        }
        return new naruto(nome, chakra, rank);
    }

    public String chakra(Double chakra) {
        String invalido = "Rank inválido!";
        if(chakra != null){
            return chakra.toString();
        }
        return invalido;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Double getChakra() {
        return chakra;
    }

    public void setChakra(Double chakra) {
        this.chakra = chakra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {

    }
}
