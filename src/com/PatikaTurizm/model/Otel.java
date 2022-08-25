package com.PatikaTurizm.model;

public class Otel {
    private int otel_id;
    private String otel_adi;
    private String adres;
    private String eposta;
    private String telefon;
    private int yildiz;

    public Otel() {}

    public Otel(int otel_id, String otel_adi, String adres, String eposta, String telefon, int yildiz) {
        this.otel_id = otel_id;
        this.otel_adi = otel_adi;
        this.adres = adres;
        this.eposta = eposta;
        this.telefon = telefon;
        this.yildiz = yildiz;
    }

    public int getOtel_id() {
        return otel_id;
    }

    public void setOtel_id(int otel_id) {
        this.otel_id = otel_id;
    }

    public String getOtel_adi() {
        return otel_adi;
    }

    public void setOtel_adi(String otel_adi) {
        this.otel_adi = otel_adi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getYildiz() {
        return yildiz;
    }

    public void setYildiz(int yildiz) {
        this.yildiz = yildiz;
    }
}