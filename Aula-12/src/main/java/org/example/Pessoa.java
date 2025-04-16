package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private String tipoDeficiencia;
    private String grau;
    private String endereco;
    private List<Atendimento> atendimentos;

    public Pessoa(String nome, String tipoDeficiencia, String grau, String endereco) {
        this.nome = nome;
        this.tipoDeficiencia = tipoDeficiencia;
        this.grau = grau;
        this.endereco = endereco;
        this.atendimentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getTipoDeficiencia() {
        return tipoDeficiencia;
    }

    public String getGrau() {
        return grau;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        this.atendimentos.add(atendimento);
    }

    public Atendimento getUltimoAtendimento() {
        if (!atendimentos.isEmpty()) {
            return atendimentos.get(atendimentos.size() - 1);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Tipo: " + tipoDeficiencia + ", Grau: " + grau + ", Endereço: " + endereco;
    }
}
