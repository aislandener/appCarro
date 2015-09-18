package com.example.aislan.appcarros.control;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.aislan.appcarros.model.Carro;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aislan on 17/09/15.
 */
public class DAO extends SQLiteOpenHelper {

    private Context context;

    public DAO(Context context) {
        super(context, IDAO.DATABASE_NAME, null, IDAO.DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(IDAO.CREATE_TABLE_CARROS);
        db.execSQL(IDAO.INSERT_CARROS);
    }

    public void iniciarBanco() {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DROP TABLE IF EXISTS carros");
        onCreate(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public List<Carro> buscarCarros() {
        try {
            String[] where = new String[]{};
            SQLiteDatabase db = this.getReadableDatabase();
            String sql = "SELECT * FROM carros";
            List<Carro> cars = new ArrayList<>();
            Cursor cu = db.rawQuery(sql, where);
            if (cu.moveToFirst()) {
                do {
                    Carro car = new Carro();
                    car.setId(cu.getInt(cu.getColumnIndex("id")));
                    car.setMarca(cu.getString(cu.getColumnIndex("marca")));
                    car.setModelo(cu.getString(cu.getColumnIndex("modelo")));
                    car.setMotor(cu.getDouble(cu.getColumnIndex("motor")));
                    car.setAno(cu.getInt(cu.getColumnIndex("ano")));
                    car.setCavalo(cu.getDouble(cu.getColumnIndex("cavalo")));
                    car.setConEtanol(cu.getFloat(cu.getColumnIndex("conEtanol")));
                    car.setConGasolina(cu.getFloat(cu.getColumnIndex("conGasolina")));
                    car.setVlrRevisao(cu.getDouble(cu.getColumnIndex("vlrRevisao")));
                    car.setVlrSeguro(cu.getDouble(cu.getColumnIndex("vlrSeguro")));
                    car.setPreco(cu.getDouble(cu.getColumnIndex("preco")));
                    cars.add(car);
                } while (cu.moveToNext());
            }
            return cars;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Carro findCarro(int id) {
        try {
            String[] where = new String[]{Integer.toString(id)};
            SQLiteDatabase db = this.getReadableDatabase();
            String sql = "SELECT * FROM carros WHERE id = ?";
            Carro car = new Carro();
            Cursor cu = db.rawQuery(sql, where);
            if (cu.moveToFirst()) {
                car.setId(cu.getInt(cu.getColumnIndex("id")));
                car.setMarca(cu.getString(cu.getColumnIndex("marca")));
                car.setModelo(cu.getString(cu.getColumnIndex("modelo")));
                car.setMotor(cu.getDouble(cu.getColumnIndex("motor")));
                car.setAno(cu.getInt(cu.getColumnIndex("ano")));
                car.setCavalo(cu.getDouble(cu.getColumnIndex("cavalo")));
                car.setConEtanol(cu.getFloat(cu.getColumnIndex("conEtanol")));
                car.setConGasolina(cu.getFloat(cu.getColumnIndex("conGasolina")));
                car.setVlrRevisao(cu.getDouble(cu.getColumnIndex("vlrRevisao")));
                car.setVlrSeguro(cu.getDouble(cu.getColumnIndex("vlrSeguro")));
                car.setPreco(cu.getDouble(cu.getColumnIndex("preco")));
            }
            return car;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<Carro> buscarCarros(int id) {
        try {
            String[] where = new String[]{Integer.toString(id)};
            SQLiteDatabase db = this.getReadableDatabase();
            String sql = "SELECT * FROM carros WHERE id NOT LIKE ?";
            List<Carro> cars = new ArrayList<>();
            Cursor cu = db.rawQuery(sql, where);
            if (cu.moveToFirst()) {
                do {
                    Carro car = new Carro();
                    car.setId(cu.getInt(cu.getColumnIndex("id")));
                    car.setMarca(cu.getString(cu.getColumnIndex("marca")));
                    car.setModelo(cu.getString(cu.getColumnIndex("modelo")));
                    car.setMotor(cu.getDouble(cu.getColumnIndex("motor")));
                    car.setAno(cu.getInt(cu.getColumnIndex("ano")));
                    car.setCavalo(cu.getDouble(cu.getColumnIndex("cavalo")));
                    car.setConEtanol(cu.getFloat(cu.getColumnIndex("conEtanol")));
                    car.setConGasolina(cu.getFloat(cu.getColumnIndex("conGasolina")));
                    car.setVlrRevisao(cu.getDouble(cu.getColumnIndex("vlrRevisao")));
                    car.setVlrSeguro(cu.getDouble(cu.getColumnIndex("vlrSeguro")));
                    car.setPreco(cu.getDouble(cu.getColumnIndex("preco")));
                    cars.add(car);
                } while (cu.moveToNext());
            }
            return cars;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
