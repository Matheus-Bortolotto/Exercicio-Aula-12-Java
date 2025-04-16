package org.example;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String cidade;
    private List<Jogadora> jogadoras;

    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.jogadoras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarJogadora(Jogadora jogadora) {
        jogadoras.add(jogadora);
    }

    public List<Jogadora> getJogadoras() {
        return jogadoras;
    }

    public String getCidade() {
        return cidade;
    }
}
