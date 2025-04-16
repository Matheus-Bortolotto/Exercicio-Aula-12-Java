package org.example;

public interface OperacoesCampeonato {
    void cadastrarTime(Time time);
    void registrarPartida(String timeA, String timeB, int golsA, int golsB);
    void mostrarClassificacao();
}