package org.example;

import java.util.HashMap;
import java.util.Map;

public class Campeonato implements OperacoesCampeonato {
    private Map<String, Time> times = new HashMap<>();
    private Map<String, Integer> pontos = new HashMap<>();

    @Override
    public void cadastrarTime(Time time) {
        times.put(time.getNome(), time);
        pontos.put(time.getNome(), 0);
        System.out.println("Time cadastrado: " + time.getNome() + " - " + time.getCidade());
    }

    @Override
    public void registrarPartida(String timeA, String timeB, int golsA, int golsB) {
        if (!times.containsKey(timeA) || !times.containsKey(timeB)) {
            System.out.println("Um dos times não está cadastrado.");
            return;
        }

        if (golsA > golsB) {
            pontos.put(timeA, pontos.get(timeA) + 3);
        } else if (golsB > golsA) {
            pontos.put(timeB, pontos.get(timeB) + 3);
        } else {
            pontos.put(timeA, pontos.get(timeA) + 1);
            pontos.put(timeB, pontos.get(timeB) + 1);
        }

        System.out.println("Partida registrada: " + timeA + " " + golsA + " x " + golsB + " " + timeB);
    }

    @Override
    public void mostrarClassificacao() {
        System.out.println("Classificação:");
        pontos.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " pts"));
    }
}
