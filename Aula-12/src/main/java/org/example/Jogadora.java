package org.example;

public class Jogadora {
    private String nome;
    private int idade;
    private String posicao;
    private int numero;

    public Jogadora(String nome, int idade, String posicao, int numero) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos, " + posicao + ", camisa " + numero + ")";
    }
}
