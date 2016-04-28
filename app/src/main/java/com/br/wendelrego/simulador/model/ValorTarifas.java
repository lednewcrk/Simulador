package com.br.wendelrego.simulador.model;

import java.util.List;

/**
 * Created by Wendel Rêgo on 27/04/2016.
 */
public class ValorTarifas {

    private List<Double> valoresTarifas;
    private double ICMS;
    private double COFINS;
    private double PIS;

    public List<Double> getValoresTarifas() {
        return valoresTarifas;
    }

    public void setValoresTarifas(List<Double> valoresTarifas) {
        this.valoresTarifas = valoresTarifas;
    }

    public double getICMS() {
        return ICMS;
    }

    public void setICMS(double ICMS) {
        this.ICMS = ICMS;
    }

    public double getCOFINS() {
        return COFINS;
    }

    public void setCOFINS(double COFINS) {
        this.COFINS = COFINS;
    }

    public double getPIS() {
        return PIS;
    }

    public void setPIS(double PIS) {
        this.PIS = PIS;
    }
}
