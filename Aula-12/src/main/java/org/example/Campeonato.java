package org.example;

import java.util.ArrayList;
import java.util.List;

public class Campeonato implements OperacoesCampeonato {
    private List<Time> times = new ArrayList<>();

    @Override
    public void cadastrarTime(String nome, String cidade) {
        times.add(new Time(nome, cidade));
        System.out.println("Time cadastrado: " + nome + " (" + cidade + ")");
    }

    @Override
    public void adicionarJogadora(String nomeTime, Jogadora jogadora) {
        for (Time t : times) {
            if (t.getNome().equalsIgnoreCase(nomeTime)) {
                t.adicionarJogadora(jogadora);
                System.out.println("Jogadora " + jogadora + " adicionada ao time " + nomeTime);
                return;
            }
        }
        System.out.println("Time não encontrado: " + nomeTime);
    }

    @Override
    public void registrarPartida(String timeA, String timeB, int golsA, int golsB) {
        Time t1 = null, t2 = null;
        for (Time t : times) {
            if (t.getNome().equalsIgnoreCase(timeA)) t1 = t;
            if (t.getNome().equalsIgnoreCase(timeB)) t2 = t;
        }

        if (t1 == null || t2 == null) {
            System.out.println("Um dos times não foi encontrado.");
            return;
        }

        if (golsA > golsB) {
            t1.adicionarPontos(3);
        } else if (golsB > golsA) {
            t2.adicionarPontos(3);
        } else {
            t1.adicionarPontos(1);
            t2.adicionarPontos(1);
        }

        System.out.println("Partida registrada: " + timeA + " " + golsA + " x " + golsB + " " + timeB);
    }

    @Override
    public void mostrarClassificacao() {
        System.out.println("Classificação:");
        times.stream()
                .sorted((a, b) -> b.getPontos() - a.getPontos())
                .forEach(t -> System.out.println(t.getNome() + ": " + t.getPontos() + " pts"));
    }
}
