package com.br.wendelrego.simulador.model;

import com.br.wendelrego.simulador.dao.TarifaDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wendel Rêgo on 26/04/2016.
 */
public class Tarifa {

    private TarifaDAO tarifaDAO;
    private ValorTarifas tarifas0;
    private ValorTarifas tarifas1;
    private ValorTarifas tarifas2;
    private List<Double> tarifasFinal0 = new ArrayList<>();
    private List<Double> tarifasFinal1 = new ArrayList<>();
    private List<Double> tarifasFinal2 = new ArrayList<>();

    public Tarifa() {
        tarifaDAO = new TarifaDAO();
        tarifas0 = tarifaDAO.getTarifas(0);
        tarifas1 = tarifaDAO.getTarifas(1);
        tarifas2 = tarifaDAO.getTarifas(2);
        calculaTarifaFinal();
    }

    public void setValorTarifa(ValorTarifas novasTarifas, int tipo) {
        if (tipo == 0) {
            tarifas0 = novasTarifas;
        } else if (tipo == 1) {
            tarifas1 = novasTarifas;
        } else {
            tarifas2 = novasTarifas;
        }
        calculaTarifaFinal();
        tarifaDAO = new TarifaDAO();
        tarifaDAO.atualizaTarifas(tarifas0, tarifas1, tarifas2);
    }

    public void calculaTarifaFinal() {
        for (int i = 0; i < tarifas0.getValoresTarifas().size(); i++) {
            tarifasFinal0.add(calculaTarifa(tarifas0.getValoresTarifas().get(i), tarifas0.getICMS(),
                    tarifas0.getCOFINS(), tarifas0.getPIS()));
        }
        for (int i = 0; i < tarifas1.getValoresTarifas().size(); i++) {
            tarifasFinal1.add(calculaTarifa(tarifas1.getValoresTarifas().get(i), tarifas1.getICMS(),
                    tarifas1.getCOFINS(), tarifas1.getPIS()));
        }
        for (int i = 0; i < tarifas2.getValoresTarifas().size(); i++) {
            tarifasFinal2.add(calculaTarifa(tarifas2.getValoresTarifas().get(i), tarifas2.getICMS(),
                    tarifas2.getCOFINS(), tarifas2.getPIS()));
        }
    }

    public List<Double> getTarifas(double consumo) {
        if (consumo <= 50) {
            return tarifasFinal0;
        } else if (consumo <= 149.99) {
            return tarifasFinal1;
        } else {
            return tarifasFinal2;
        }
    }

    private double calculaTarifa(double tarifa, double ICMS, double COFINS, double PIS) {
        return tarifa / (1 - (ICMS + (PIS / COFINS)));
    }

}
