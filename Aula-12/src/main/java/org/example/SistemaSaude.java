package org.example;

import java.util.HashMap;
import java.util.Map;

public class SistemaSaude implements OperacoesSaude {
    private Map<String, Pessoa> pessoas = new HashMap<>();

    @Override
    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.put(pessoa.getNome(), pessoa);
        System.out.println("Pessoa cadastrada: " + pessoa);
    }

    @Override
    public void registrarAtendimento(String nomePessoa, Atendimento atendimento) {
        Pessoa p = pessoas.get(nomePessoa);
        if (p != null) {
            p.adicionarAtendimento(atendimento);
            System.out.println("Atendimento registrado para " + nomePessoa);
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    @Override
    public void gerarRelatorio(String nomePessoa) {
        Pessoa p = pessoas.get(nomePessoa);
        if (p != null) {
            System.out.println("Relatório de " + p.getNome());
            for (Atendimento a : p.getAtendimentos()) {
                System.out.println("- " + a);
            }
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }
}
