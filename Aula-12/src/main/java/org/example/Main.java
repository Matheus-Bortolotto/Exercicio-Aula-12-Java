package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // ===============================
        // DESAFIO 1 - CAMPEONATO DE FUTEBOL FEMININO
        // ===============================
        System.out.println("===== CAMPEONATO DE FUTEBOL =====");
        Campeonato campeonato = new Campeonato();

        Time corinthians = new Time("Corinthians", "São Paulo");
        corinthians.adicionarJogadora(new Jogadora("Maria", 24, "Atacante", 9));
        corinthians.adicionarJogadora(new Jogadora("Ana", 22, "Meio-campo", 10));

        Time palmeiras = new Time("Palmeiras", "São Paulo");
        palmeiras.adicionarJogadora(new Jogadora("Luiza", 23, "Zagueira", 3));
        palmeiras.adicionarJogadora(new Jogadora("Clara", 21, "Goleira", 1));

        campeonato.cadastrarTime(corinthians);
        campeonato.cadastrarTime(palmeiras);

        campeonato.registrarPartida("Corinthians", "Palmeiras", 2, 1);
        campeonato.mostrarClassificacao();


        // ===============================
        // DESAFIO 2 - SISTEMA DE SAÚDE
        // ===============================
        System.out.println("\n===== SISTEMA DE SAÚDE =====");
        SistemaSaude sistemaSaude = new SistemaSaude();

        Pessoa joao = new Pessoa("João", 30, "Visual", "Moderado", "Rua A, 123");
        sistemaSaude.cadastrarPessoa(joao);

        Atendimento at1 = new Atendimento(LocalDate.of(2025, 4, 10), "Consulta", "Dra. Fernanda");
        Atendimento at2 = new Atendimento(LocalDate.of(2025, 4, 15), "Fisioterapia", "Dr. Pedro");

        sistemaSaude.registrarAtendimento("João", at1);
        sistemaSaude.registrarAtendimento("João", at2);

        sistemaSaude.gerarRelatorio("João");


        // ===============================
        // DESAFIO 3 - CONTROLE DE PEDÁGIO
        // ===============================
        System.out.println("\n===== CONTROLE DE PEDÁGIO SIMPLIFICADO =====");
        OperacoesPedagio pedagio = new ControleDePedagio();

        pedagio.registrarVeiculo("DEF-1234", "Caminhao", 5);
        pedagio.calcularValor();
        pedagio.emitirRelatorio();
    }
}
