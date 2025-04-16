package org.example;

import java.util.ArrayList;
import java.util.List;

public class PracaPedagio {
    private String localizacao;
    private double tarifaBase;
    private List<Veiculo> veiculos = new ArrayList<>();
    private double totalArrecadado = 0;

    public PracaPedagio(String localizacao, double tarifaBase) {
        this.localizacao = localizacao;
        this.tarifaBase = tarifaBase;
    }

    public void registrarVeiculo(Veiculo v) {
        veiculos.add(v);
        double valor = 0;
        switch (v.getTipo().toLowerCase()) {
            case "carro":
                valor = tarifaBase;
                break;
            case "moto":
                valor = tarifaBase * 0.5;
                break;
            case "caminhao":
                valor = tarifaBase * v.getEixos();
                break;
        }
        totalArrecadado += valor;
        System.out.println("Veículo " + v.getPlaca() + " passou pela praça " + localizacao + " - Valor: R$" + valor);
    }

    public void emitirRelatorio() {
        System.out.println("Relatório da praça " + localizacao + ":");
        for (Veiculo v : veiculos) {
            System.out.println("- " + v.getPlaca() + " (" + v.getTipo() + ")");
        }
        System.out.println("Total arrecadado: R$" + totalArrecadado);
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
