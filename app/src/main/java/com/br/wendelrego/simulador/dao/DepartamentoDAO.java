package com.br.wendelrego.simulador.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.br.wendelrego.simulador.model.Departamento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wendel Rêgo on 28/04/2016.
 */
public class DepartamentoDAO extends SQLiteOpenHelper{

    public DepartamentoDAO(Context context) {
        super(context, "simulador_db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public List<Departamento> getListaDepartamentos() {
        List<Departamento> listaDepartamentos = new ArrayList<>();
        return listaDepartamentos;
    }


}
