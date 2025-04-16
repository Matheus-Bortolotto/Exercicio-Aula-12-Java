package org.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class SistemaSaude implements OperacoesSaude {
    private Map<String, Pessoa> pessoas = new HashMap<>();

    @Override
    public void cadastrarPessoa(String nome, String tipoDeficiencia, String grau, String endereco) {
        Pessoa pessoa = new Pessoa(nome, tipoDeficiencia, grau, endereco);
        pessoas.put(nome, pessoa);
        System.out.println("Pessoa cadastrada: " + nome);
    }

    @Override
    public void registrarAtendimento(String nomePessoa, String tipoAtendimento) {
        Pessoa pessoa = pessoas.get(nomePessoa);
        if (pessoa != null) {
            Atendimento atendimento = new Atendimento(LocalDate.now(), tipoAtendimento, "Profissional de saúde");
            pessoa.adicionarAtendimento(atendimento);
            System.out.println("Atendimento registrado para " + nomePessoa + ": " + tipoAtendimento);
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    @Override
    public void gerarRelatorio(String nomePessoa) {
        Pessoa pessoa = pessoas.get(nomePessoa);
        if (pessoa != null) {
            System.out.println("Relatório de " + nomePessoa);
            System.out.println("Deficiência: " + pessoa.getTipoDeficiencia());
            System.out.println("Grau: " + pessoa.getGrau());
            System.out.println("Endereço: " + pessoa.getEndereco());
            System.out.println("Atendimentos:");
            for (Atendimento atendimento : pessoa.getAtendimentos()) {
                System.out.println(atendimento);
            }
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }
}
