package org.example;

public interface OperacoesSaude {
    void cadastrarPessoa(String nome, String tipoDeficiencia, String grau, String endereco);
    void registrarAtendimento(String nomePessoa, String tipoAtendimento);
    void gerarRelatorio(String nomePessoa);
}
