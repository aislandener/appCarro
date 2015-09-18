package com.example.aislan.appcarros.model;

/**
 * Created by aislan on 17/09/15.
 */
public class Carro {

    private int id;
    private String marca;
    private String modelo;
    private double motor;
    private int ano;
    private double cavalo;
    private float conEtanol;
    private float conGasolina;
    private double vlrRevisao;
    private double vlrSeguro;
    private double preco;

    public Carro() {
    }

    public Carro(int id,String marca, String modelo, double motor, int ano, double cavalo, float conEtanol, float conGasolina, double vlrRevisao, double vlrSeguro, double preco) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.ano = ano;
        this.cavalo = cavalo;
        this.conEtanol = conEtanol;
        this.conGasolina = conGasolina;
        this.vlrRevisao = vlrRevisao;
        this.vlrSeguro = vlrSeguro;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getCavalo() {
        return cavalo;
    }

    public void setCavalo(double cavalo) {
        this.cavalo = cavalo;
    }

    public float getConEtanol() {
        return conEtanol;
    }

    public void setConEtanol(float conEtanol) {
        this.conEtanol = conEtanol;
    }

    public float getConGasolina() {
        return conGasolina;
    }

    public void setConGasolina(float conGasolina) {
        this.conGasolina = conGasolina;
    }

    public double getVlrRevisao() {
        return vlrRevisao;
    }

    public void setVlrRevisao(double vlrRevisao) {
        this.vlrRevisao = vlrRevisao;
    }

    public double getVlrSeguro() {
        return vlrSeguro;
    }

    public void setVlrSeguro(double vlrSeguro) {
        this.vlrSeguro = vlrSeguro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String linha_completa(){
        return marca + " " + modelo + " " + motor+ " " + ano;
    }
}
