package com.br.wendelrego.simulador;

import com.br.wendelrego.simulador.model.Tarifa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wendel Rêgo on 27/04/2016.
 */
public class Helper {

    private Tarifa tarifa;
    private double valor;
    List<Double> tarifas;

    public double getValorReais(double consumo) {

        tarifa = new Tarifa();
        this.valor = 0;
        this.tarifas = (ArrayList) tarifa.getTarifas(consumo);

        //COM BASE NO CONSUMO RECEBIDO FAZEMOS CALCULOS DIFERENTES POIS QUANTO MAIOR O CONSUMO, MAIS TARIFAS TEMOS
        if (consumo <= 50) {
            if (consumo > 30) {
                valor += 30 * tarifas.get(0);
                consumo -= 30;
            } else {
                valor += consumo * tarifas.get(0);
                return valor;
            }
            valor += consumo * tarifas.get(1);
        } else if (consumo <= 149.99) {
            valor += 30 * tarifas.get(0);
            consumo -= 30;
            if (consumo > 70) {
                valor += 70 * tarifas.get(1);
                consumo -= 70;
            } else {
                valor += consumo * tarifas.get(1);
                return valor;
            }
            valor += consumo * tarifas.get(2);
        } else {
            valor += 30 * tarifas.get(0);
            consumo -= 30;
            valor += 70 * tarifas.get(1);
            consumo -= 70;
            if (consumo > 120) {
                valor += 120 * tarifas.get(2);
                consumo -= 70;
            } else {
                valor += consumo * tarifas.get(2);
                return valor;
            }
            valor += consumo * tarifas.get(3);
        }
        return valor;
    }
}
