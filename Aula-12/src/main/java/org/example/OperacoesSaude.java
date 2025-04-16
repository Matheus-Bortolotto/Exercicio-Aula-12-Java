package org.example;

public interface OperacoesSaude {
    void cadastrarPessoa(Pessoa pessoa);
    void registrarAtendimento(String nomePessoa, Atendimento atendimento);
    void gerarRelatorio(String nomePessoa);
}
