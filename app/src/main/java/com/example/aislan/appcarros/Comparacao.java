package com.example.aislan.appcarros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.aislan.appcarros.control.DAO;
import com.example.aislan.appcarros.model.Carro;

public class Comparacao extends AppCompatActivity {
    private int pId;
    private int pId2;
    private TableLayout tbComparacao;
    private Carro carro1;
    private Carro carro2;
    private int ponto1;
    private int ponto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparacao);
        createResources();
        montarTabela();
    }

    private void createResources(){
        tbComparacao = (TableLayout) findViewById(R.id.tb_comparacao);

        Intent it = getIntent();
        Bundle param = it.getExtras();
        if(param!=null){
            pId = param.getInt("pId");
            pId2 = param.getInt("pId2");
        }

        carro1 = new DAO(getApplicationContext()).findCarro(pId);
        carro2 = new DAO(getApplicationContext()).findCarro(pId2);
    }

    private void montarTabelaCabecalho(){
        tbComparacao.removeAllViews();
        TableRow tr = new TableRow(this);

        TextView titulo1 = new TextView(this);
        titulo1.setText("Modelo");
        tr.addView(titulo1);

        TextView titulo2 = new TextView(this);
        titulo2.setText(carro1.linha_completa());
        tr.addView(titulo2);

        TextView titulo3 = new TextView(this);
        titulo3.setText(carro2.linha_completa());
        tr.addView(titulo3);

        tbComparacao.addView(tr);
    }

    private void montarTabelaPreco(){
        TableRow tr = new TableRow(this);

        TextView preco1 = new TextView(this);
        preco1.setText(getResources().getString(R.string.preco));
        tr.addView(preco1);

        TextView preco2 = new TextView(this);
        preco2.setText(Double.toString(carro1.getPreco()));
        if (carro1.getPreco() <= carro2.getPreco()){
            preco2.setTextColor(getResources().getColor(R.color.melhor));
            ponto1++;
        }else{
            preco2.setTextColor(getResources().getColor(R.color.pior));
        }
        tr.addView(preco2);

        TextView preco3 = new TextView(this);
        preco3.setText(Double.toString(carro2.getPreco()));
        if (carro1.getPreco() >= carro2.getPreco()){
            preco3.setTextColor(getResources().getColor(R.color.melhor));
            ponto2++;
        }else{
            preco3.setTextColor(getResources().getColor(R.color.pior));
        }
        tr.addView(preco3);

        tbComparacao.addView(tr);
    }

    private void montarTabelaCavalo(){
        TableRow tr = new TableRow(this);

        TextView cavalo1 = new TextView(this);
        cavalo1.setText(getResources().getString(R.string.cavalo));
        tr.addView(cavalo1);

        TextView cavalo2 = new TextView(this);
        cavalo2.setText(Double.toString(carro1.getCavalo()));
        if (carro1.getCavalo() >= carro2.getCavalo()){
            cavalo2.setTextColor(getResources().getColor(R.color.melhor));
            ponto1++;
        }else{
            cavalo2.setTextColor(getResources().getColor(R.color.pior));
        }
        tr.addView(cavalo2);

        TextView cavalo3 = new TextView(this);
        cavalo3.setText(Double.toString(carro2.getCavalo()));
        if (carro1.getCavalo() <= carro2.getCavalo()){
            cavalo3.setTextColor(getResources().getColor(R.color.melhor));
            ponto2++;
        }else{
            cavalo3.setTextColor(getResources().getColor(R.color.pior));
        }
        tr.addView(cavalo3);

        tbComparacao.addView(tr);
    }

    private void montarTabelaConEtanol(){
        TableRow tr = new TableRow(this);

        TextView conEtanol1 = new TextView(this);
        conEtanol1.setText(getResources().getString(R.string.conEtanol));
        tr.addView(conEtanol1);

        TextView conEtanol2 = new TextView(this);
        conEtanol2.setText(Float.toString(carro1.getConEtanol()));
        if (carro1.getConEtanol() >= carro2.getConEtanol()){
            conEtanol2.setTextColor(getResources().getColor(R.color.melhor));
            ponto1++;
        }else{
            conEtanol2.setTextColor(getResources().getColor(R.color.pior));
        }
        tr.addView(conEtanol2);

        TextView conEtanol3 = new TextView(this);
        conEtanol3.setText(Float.toString(carro2.getConEtanol()));
        if (carro1.getConEtanol() <= carro2.getConEtanol()){
            conEtanol3.setTextColor(getResources().getColor(R.color.melhor));
            ponto2++;
        }else{
            conEtanol3.setTextColor(getResources().getColor(R.color.pior));
        }
        tr.addView(conEtanol3);

        tbComparacao.addView(tr);
    }

    private void montarTabelaConGasolina(){
        TableRow tr = new TableRow(this);

        TextView conGasolina1 = new TextView(this);
        conGasolina1.setText(getResources().getString(R.string.conGasolina));
        tr.addView(conGasolina1);

        TextView conGasolina2 = new TextView(this);
        conGasolina2.setText(Float.toString(carro1.getConGasolina()));
        if (carro1.getConGasolina() >= carro2.getConGasolina()){
            conGasolina2.setTextColor(getResources().getColor(R.color.melhor));
            ponto1++;
        }else{
            conGasolina2.setTextColor(getResources().getColor(R.color.pior));
        }
        tr.addView(conGasolina2);

        TextView conGasolina3 = new TextView(this);
        conGasolina3.setText(Float.toString(carro2.getConGasolina()));
        if (carro1.getConGasolina() <= carro2.getConGasolina()){
            conGasolina3.setTextColor(getResources().getColor(R.color.melhor));
            ponto2++;
        }else{
            conGasolina3.setTextColor(getResources().getColor(R.color.pior));
        }
        tr.addView(conGasolina3);

        tbComparacao.addView(tr);
    }

    private void montarTabelaRevisao(){
        TableRow tr = new TableRow(this);

        TextView vlrRevisao1 = new TextView(this);
        vlrRevisao1.setText(getResources().getString(R.string.vlrRevisao));
        tr.addView(vlrRevisao1);

        TextView vlrRevisao2 = new TextView(this);
        vlrRevisao2.setText(Double.toString(carro1.getVlrRevisao()));
        if (carro1.getVlrRevisao() <= carro2.getVlrRevisao()){
            vlrRevisao2.setTextColor(getResources().getColor(R.color.melhor));
            ponto1++;
        }else{
            vlrRevisao2.setTextColor(getResources().getColor(R.color.pior));
        }
        tr.addView(vlrRevisao2);

        TextView vlrRevisao3 = new TextView(this);
        vlrRevisao3.setText(Double.toString(carro2.getVlrRevisao()));
        if (carro1.getVlrRevisao() >= carro2.getVlrRevisao()){
            vlrRevisao3.setTextColor(getResources().getColor(R.color.melhor));
            ponto2++;
        }else{
            vlrRevisao3.setTextColor(getResources().getColor(R.color.pior));
        }
        tr.addView(vlrRevisao3);

        tbComparacao.addView(tr);
    }

    private void montarTabelaSeguro(){
        TableRow tr = new TableRow(this);

        TextView vlrSeguro1 = new TextView(this);
        vlrSeguro1.setText(getResources().getString(R.string.vlrSeguro));
        tr.addView(vlrSeguro1);

        TextView vlrSeguro2 = new TextView(this);
        vlrSeguro2.setText(Double.toString(carro1.getVlrSeguro()));
        if (carro1.getVlrSeguro() <= carro2.getVlrSeguro()){
            vlrSeguro2.setTextColor(getResources().getColor(R.color.melhor));
            ponto1++;
        }else{
            vlrSeguro2.setTextColor(getResources().getColor(R.color.pior));
        }
        tr.addView(vlrSeguro2);

        TextView vlrSeguro3 = new TextView(this);
        vlrSeguro3.setText(Double.toString(carro2.getVlrSeguro()));
        if (carro1.getVlrSeguro() >= carro2.getVlrSeguro()){
            vlrSeguro3.setTextColor(getResources().getColor(R.color.melhor));
            ponto2++;
        }else{
            vlrSeguro3.setTextColor(getResources().getColor(R.color.pior));
        }
        tr.addView(vlrSeguro3);

        tbComparacao.addView(tr);
    }

    private void montarTabelaPontuacao(){
        TableRow tr = new TableRow(this);

        TextView pontuacao1 = new TextView(this);
        pontuacao1.setText(getResources().getString(R.string.pontuacao));
        tr.addView(pontuacao1);

        TextView pontuacao2 = new TextView(this);
        pontuacao2.setText(Integer.toString(ponto1));
        tr.addView(pontuacao2);

        TextView pontuacao3 = new TextView(this);
        pontuacao3.setText(Integer.toString(ponto2));
        tr.addView(pontuacao3);

        tbComparacao.addView(tr);
    }

    private void montarTabela(){
        montarTabelaCabecalho();
        montarTabelaPreco();
        montarTabelaCavalo();
        montarTabelaConEtanol();
        montarTabelaConGasolina();
        montarTabelaRevisao();
        montarTabelaSeguro();
        montarTabelaPontuacao();
    }
}
