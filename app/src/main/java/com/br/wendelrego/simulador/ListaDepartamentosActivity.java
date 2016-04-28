package com.br.wendelrego.simulador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.br.wendelrego.simulador.dao.DepartamentoDAO;
import com.br.wendelrego.simulador.model.Departamento;

import java.util.List;

public class ListaDepartamentosActivity extends AppCompatActivity {

    private DepartamentoDAO departamentoDAO;
    private ListView lvListaDepartamento;
    private List<Departamento> listaDepartamento;
    private ArrayAdapter<Departamento> adapterListaDepartamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_departamentos);
        lvListaDepartamento = (ListView) findViewById(R.id.ac_lista_departamentos);
    }


    public void carregaListaDepartamentos () {
        departamentoDAO = new DepartamentoDAO(this);
        listaDepartamento = departamentoDAO.getListaDepartamentos();
        adapterListaDepartamento = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaDepartamento);
        lvListaDepartamento.setAdapter(adapterListaDepartamento);
    }

    @Override
    protected void onResume() {
        carregaListaDepartamentos();
        super.onResume();
    }
}
