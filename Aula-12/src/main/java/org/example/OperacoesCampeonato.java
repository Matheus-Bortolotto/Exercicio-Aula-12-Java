package org.example;

public interface OperacoesCampeonato {
    void cadastrarTime(String nome, String cidade);
    void adicionarJogadora(String nomeTime, Jogadora jogadora);
    void registrarPartida(String timeA, String timeB, int golsA, int golsB);
    void mostrarClassificacao();
}
