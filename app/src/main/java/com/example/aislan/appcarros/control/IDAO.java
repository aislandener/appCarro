package com.example.aislan.appcarros.control;

/**
 * Created by aislan on 17/09/15.
 */
public interface IDAO {
    public final String DATABASE_NAME = "appCarros";

    public final int DATABASE_VERSION = 1;

    public final String CREATE_TABLE_CARROS =
            "CREATE TABLE carros(" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "marca TEXT," +
                    "modelo TEXT," +
                    "motor REAL," +
                    "ano INTEGER," +
                    "preco REAL," +
                    "cavalo INTEGER," +
                    "conEtanol REAL," +
                    "conGasolina REAL," +
                    "vlrRevisao REAL," +
                    "vlrSeguro REAL" +
                ");";

    public final String INSERT_CARROS =
            "INSERT INTO carros (" +
                    "marca," +
                    "modelo," +
                    "motor," +
                    "ano," +
                    "preco," +
                    "cavalo," +
                    "conEtanol," +
                    "conGasolina," +
                    "vlrRevisao" +
                    ",vlrSeguro" +
                    ")VALUES" +
                    //primeiro valor
                    "('VW'," +
                    "'Gol'," +
                    "1.0," +
                    "2015," +
                    "29500.00," +
                    "68," +
                    "8.5," +
                    "13," +
                    "365," +
                    "2700)," +
                    //segundo valor
                    "('Fiat'," +
                    "'Palio'," +
                    "1.0," +
                    "2015," +
                    "27900," +
                    "65," +
                    "9.5," +
                    "14.5," +
                    "388," +
                    "1200);";
}
