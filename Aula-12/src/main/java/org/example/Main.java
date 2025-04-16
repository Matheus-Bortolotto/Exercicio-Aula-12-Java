package org.example;

public class Main {
    public static void main(String[] args) {
        // === Desafio 1: Campeonato de Futebol Feminino ===
        System.out.println("=== Campeonato de Futebol Feminino ===");
        OperacoesCampeonato campeonato = new Campeonato();

        // Cadastro de times
        campeonato.cadastrarTime("Corinthians", "São Paulo");
        campeonato.cadastrarTime("Cruzeiro", "Belo Horizonte");

        // Cadastro de jogadoras
        Jogadora jogadora1 = new Jogadora("Maria", 22, "Atacante", 10);
        Jogadora jogadora2 = new Jogadora("Ana", 21, "Meio-campo", 8);

        campeonato.adicionarJogadora("Corinthians", jogadora1);
        campeonato.adicionarJogadora("Cruzeiro", jogadora2);

        // Registro de partidas
        campeonato.registrarPartida("Corinthians", "Cruzeiro", 3, 1);

        // Exibição da classificação
        campeonato.mostrarClassificacao();

        // === Desafio 2: Cadastro e Acompanhamento de Pessoas com Necessidades Especiais ===
        System.out.println("\n=== Cadastro e Acompanhamento de Pessoas com Necessidades Especiais ===");
        OperacoesSaude saude = new SistemaSaude();

        // Cadastro de pessoa e atendimento
        saude.cadastrarPessoa("João", "Visual", "Leve", "Rua A");
        saude.registrarAtendimento("João", "Consulta com oftalmologista");

        // Geração de relatório
        saude.gerarRelatorio("João");

        // === Desafio 3: Sistema de Controle de Pedágios ===
        System.out.println("\n=== Controle de Pedágio ===");
        OperacoesPedagio pedagio = new ControleDePedagio();

        // Registro de veículo
        pedagio.registrarVeiculo("XYZ1234", "caminhao", 6);

        // Cálculo do valor do pedágio
        pedagio.calcularValor("XYZ1234");

        // Exibição do relatório de veículos
        pedagio.emitirRelatorio();
    }
}
