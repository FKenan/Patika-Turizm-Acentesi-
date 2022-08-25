package com.PatikaTurizm.model;

public class Oda {
    private int oda_id;
    private int otel_id;
    private short yatak_sayisi;
    private short televizyon;
    private short minibar;
    private short oyun_konsolu;
    private short metrekare;
    private short kasa;
    private short projeksiyon;

    public Oda() {}

    public Oda(int oda_id, int otel_id, short yatak_sayisi, short televizyon, short minibar,
               short oyun_konsolu, short metrekare, short kasa, short projeksiyon) {
        this.oda_id = oda_id;
        this.otel_id = otel_id;
        this.yatak_sayisi = yatak_sayisi;
        this.televizyon = televizyon;
        this.minibar = minibar;
        this.oyun_konsolu = oyun_konsolu;
        this.metrekare = metrekare;
        this.kasa = kasa;
        this.projeksiyon = projeksiyon;
    }

    public int getOda_id() {
        return oda_id;
    }

    public void setOda_id(int oda_id) {
        this.oda_id = oda_id;
    }

    public int getOtel_id() {
        return otel_id;
    }

    public void setOtel_id(int otel_id) {
        this.otel_id = otel_id;
    }

    public short getYatak_sayisi() {
        return yatak_sayisi;
    }

    public void setYatak_sayisi(short yatak_sayisi) {
        this.yatak_sayisi = yatak_sayisi;
    }

    public short getTelevizyon() {
        return televizyon;
    }

    public void setTelevizyon(short televizyon) {
        this.televizyon = televizyon;
    }

    public short getMinibar() {
        return minibar;
    }

    public void setMinibar(short minibar) {
        this.minibar = minibar;
    }

    public short getOyun_konsolu() {
        return oyun_konsolu;
    }

    public void setOyun_konsolu(short oyun_konsolu) {
        this.oyun_konsolu = oyun_konsolu;
    }

    public short getMetrekare() {
        return metrekare;
    }

    public void setMetrekare(short metrekare) {
        this.metrekare = metrekare;
    }

    public short getKasa() {
        return kasa;
    }

    public void setKasa(short kasa) {
        this.kasa = kasa;
    }

    public short getProjeksiyon() {
        return projeksiyon;
    }

    public void setProjeksiyon(short projeksiyon) {
        this.projeksiyon = projeksiyon;
    }
}