package com.ti2cc;

public class Carro {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public Carro() {
        this.id = -1;
        this.marca = "";
        this.modelo = "";
        this.ano = 0;
        this.cor = "";
    }

    public Carro(int id, String marca, String modelo, int ano, String cor) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", cor=" + cor + "]";
    }
}