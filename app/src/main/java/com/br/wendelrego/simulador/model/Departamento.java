package com.br.wendelrego.simulador.model;

import java.util.List;

/**
 * Created by Wendel Rêgo on 26/04/2016.
 */
public class Departamento {
    private int id;
    private String nome;
    private double consumo;
    private List<Aparelho> listaAparelhos;

    //FUNCAO PARA CALCULO DO CONSUMO DEM KHW DO SETOR
    public double getConsumo() {
        for (Aparelho aparelho : listaAparelhos) {
            consumo += aparelho.getConsumo();
        }
        return consumo;
    }

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

    public void setAparelho (Aparelho aparelho) {
        listaAparelhos.add(aparelho);
    }

    public List<Aparelho> getListaAparelhos() {
        return listaAparelhos;
    }

    public void setListaAparelhos(List<Aparelho> listaAparelhos) {
        this.listaAparelhos = listaAparelhos;
    }
}
