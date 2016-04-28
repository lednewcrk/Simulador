package com.br.wendelrego.simulador.model;

/**
 * Created by Wendel Rêgo on 26/04/2016.
 */
public class Aparelho {

    private int id;
    private String nome;
    private double potencia;
    private int diasUsoMes;
    private double horasUsoDia;

    //FUNCAO PARA CALCULO DE CONSUMO DO APARELHO
    public double getConsumo() {
        return (((horasUsoDia * diasUsoMes) * potencia)) / 100;
    }

    //FUNCAO PARA CALCULO DO VALOR EM REAIS DESTE APARELHO NO SETOR
    /*public double consumoReais() {
        return 1;
    }*/

    //GETTERS E SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getHorasUsoDia() {
        return horasUsoDia;
    }

    public void setHorasUsoDia(double horasUsoDia) {
        this.horasUsoDia = horasUsoDia;
    }

    public int getDiasUsoMes() {
        return diasUsoMes;
    }

    public void setDiasUsoMes(int diasUsoMes) {
        this.diasUsoMes = diasUsoMes;
    }


}
