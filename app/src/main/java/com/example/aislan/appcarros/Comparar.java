package com.example.aislan.appcarros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.aislan.appcarros.control.DAO;
import com.example.aislan.appcarros.model.Carro;

import java.util.List;

public class Comparar extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout mLayoutComparar;
    private List<Carro> lCarros;
    private DAO db;
    private Intent it;
    private Bundle parametros;
    private int pId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparar);
        createResources();
        criarElemento();
    }

    private void createResources(){
        mLayoutComparar = (LinearLayout) findViewById(R.id.layout_comparar);
        it = getIntent();
        parametros = it.getExtras();
        if(parametros != null){
            pId = parametros.getInt("pId");
        }

        db = new DAO(getApplicationContext());
        lCarros = db.buscarCarros(pId);
    }

    private void criarElemento(){
        for(Carro car : lCarros){
            TextView tv = new TextView(this);
            tv.setText(car.linha_completa());
            tv.setId(car.getId());
            tv.setTextSize(20);
            tv.setOnClickListener(this);
            mLayoutComparar.addView(tv);
        }
    }
    @Override
    public void onClick(View v) {
        it = null;
        it = new Intent(Comparar.this,Comparacao.class);
        int pId2 = v.getId();
        parametros.putInt("pId2",pId2);
        it.putExtras(parametros);
        startActivity(it);
    }


}
