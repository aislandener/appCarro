package com.example.aislan.appcarros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aislan.appcarros.control.DAO;
import com.example.aislan.appcarros.model.Carro;

import java.util.List;

public class PaginaInicial extends AppCompatActivity implements View.OnClickListener {

    private List<Carro> lCarros;
    private DAO db;
    private LinearLayout mPaginaPrin;
    private Intent it;
    private Bundle parametros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_inicial);
        createResources();
        criarElemento();

    }

    private void createResources(){
        db = new DAO(getApplicationContext());
        try{
            db.iniciarBanco();
        }catch (Exception e){
        }
        lCarros = db.buscarCarros();
        mPaginaPrin = (LinearLayout) findViewById(R.id.layout_pagina_inical);
    }

    private void criarElemento(){
        for(Carro car : lCarros){
            TextView tv = new TextView(this);
            tv.setText(car.linha_completa());
            tv.setId(car.getId());
            tv.setTextSize(20);
            tv.setOnClickListener(this);
            mPaginaPrin.addView(tv);
        }
    }

    @Override
    public void onClick(View v) {

        parametros = new Bundle();
        it = new Intent(PaginaInicial.this,Comparar.class);
        int pId = v.getId();
        parametros.putInt("pId",pId);
        it.putExtras(parametros);
        startActivity(it);
    }
}
