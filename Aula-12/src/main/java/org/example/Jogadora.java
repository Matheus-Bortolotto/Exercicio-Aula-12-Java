package org.example;

public class Jogadora {
    private String nome;
    private int idade;
    private String posicao;
    private int numeroCamisa;

    public Jogadora(String nome, int idade, String posicao, int numeroCamisa) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    @Override
    public String toString() {
        return nome + " - " + posicao + " (Camisa " + numeroCamisa + ")";
    }
}
