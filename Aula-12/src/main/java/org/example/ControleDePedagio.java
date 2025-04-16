package org.example;

public class ControleDePedagio implements OperacoesPedagio {
    private String localizacao = "Rodovia SP-280 - Km 50";
    private double tarifaBase = 10.0;

    private String placa;
    private String tipo;
    private int eixos;
    private double valorCobrado;

    @Override
    public void registrarVeiculo(String placa, String tipo, int eixos) {
        this.placa = placa;
        this.tipo = tipo;
        this.eixos = eixos;
        System.out.println("Veículo registrado: " + placa + " - " + tipo);
    }

    @Override
    public void calcularValor() {
        switch (tipo.toLowerCase()) {
            case "carro":
                valorCobrado = tarifaBase;
                break;
            case "moto":
                valorCobrado = tarifaBase * 0.5;
                break;
            case "caminhao":
                valorCobrado = tarifaBase * eixos;
                break;
            default:
                valorCobrado = 0.0;
        }

        System.out.println("Valor cobrado: R$" + valorCobrado);
    }

    @Override
    public void emitirRelatorio() {
        System.out.println("Relatório de Pedágio:");
        System.out.println("Localização: " + localizacao);
        System.out.println("Veículo: " + placa + " - " + tipo);
        System.out.println("Valor cobrado: R$" + valorCobrado);
    }
}
