package org.example;

import java.util.HashMap;
import java.util.Map;

public class ControleDePedagio implements OperacoesPedagio {
    private Map<String, Veiculo> veiculos = new HashMap<>();
    private double tarifaBase = 10.0;

    @Override
    public void registrarVeiculo(String placa, String tipo, int eixos) {
        Veiculo veiculo = new Veiculo(placa, tipo, eixos);
        veiculos.put(placa, veiculo);
        System.out.println("Veículo registrado: " + placa + " - " + tipo);
    }

    @Override
    public void calcularValor(String placa) {
        Veiculo veiculo = veiculos.get(placa);
        if (veiculo == null) {
            System.out.println("Veículo não encontrado.");
            return;
        }

        double valorCobrado = 0.0;
        switch (veiculo.getTipo().toLowerCase()) {
            case "carro":
                valorCobrado = tarifaBase;
                break;
            case "moto":
                valorCobrado = tarifaBase * 0.5;
                break;
            case "caminhao":
                valorCobrado = tarifaBase * veiculo.getEixos();
                break;
            default:
                System.out.println("Tipo de veículo inválido.");
                return;
        }

        System.out.println("Valor cobrado para " + placa + ": R$" + valorCobrado);
    }

    @Override
    public void emitirRelatorio() {
        System.out.println("Relatório de Pedágio:");
        for (Map.Entry<String, Veiculo> entry : veiculos.entrySet()) {
            Veiculo veiculo = entry.getValue();
            System.out.println("Veículo: " + veiculo.getPlaca() + " | Tipo: " + veiculo.getTipo() + " | Eixos: " + veiculo.getEixos());
        }
    }
}
