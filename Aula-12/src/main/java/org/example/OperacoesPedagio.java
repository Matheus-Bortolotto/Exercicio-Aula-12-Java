package org.example;

public interface OperacoesPedagio {
    void registrarVeiculo(String placa, String tipo, int eixos);
    void calcularValor();
    void emitirRelatorio();
}
