package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private String tipoDeficiencia;
    private String grau;
    private String endereco;
    private List<Atendimento> atendimentos = new ArrayList<>();

    public Pessoa(String nome, int idade, String tipoDeficiencia, String grau, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.tipoDeficiencia = tipoDeficiencia;
        this.grau = grau;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    @Override
    public String toString() {
        return nome + " - " + tipoDeficiencia + " (" + grau + "), " + endereco;
    }
}
