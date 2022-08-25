package com.PatikaTurizm.model;

public class TesisOzellikleri {
    private int tesis_ozellik_id;
    private int otel_id;
    private boolean ucretsiz_otopark;
    private boolean ucretsiz_wifi;
    private boolean yuzme_havuzu;
    private boolean fitness_center;
    private boolean hotel_concirge;
    private boolean spa;
    private boolean oda_servisi_7_24;

    public TesisOzellikleri(){}

    public TesisOzellikleri(int tesis_ozellik_id, int otel_id, boolean ucretsiz_otopark, boolean ucretsiz_wifi,
                            boolean yuzme_havuzu, boolean fitness_center, boolean hotel_concirge, boolean spa,
                            boolean oda_servisi_7_24) {
        this.tesis_ozellik_id = tesis_ozellik_id;
        this.otel_id = otel_id;
        this.ucretsiz_otopark = ucretsiz_otopark;
        this.ucretsiz_wifi = ucretsiz_wifi;
        this.yuzme_havuzu = yuzme_havuzu;
        this.fitness_center = fitness_center;
        this.hotel_concirge = hotel_concirge;
        this.spa = spa;
        this.oda_servisi_7_24 = oda_servisi_7_24;
    }

    public int getTesis_ozellik_id() {
        return tesis_ozellik_id;
    }

    public void setTesis_ozellik_id(int tesis_ozellik_id) {
        this.tesis_ozellik_id = tesis_ozellik_id;
    }

    public int getOtel_id() {
        return otel_id;
    }

    public void setOtel_id(int otel_id) {
        this.otel_id = otel_id;
    }

    public boolean isUcretsiz_otopark() {
        return ucretsiz_otopark;
    }

    public void setUcretsiz_otopark(boolean ucretsiz_otopark) {
        this.ucretsiz_otopark = ucretsiz_otopark;
    }

    public boolean isUcretsiz_wifi() {
        return ucretsiz_wifi;
    }

    public void setUcretsiz_wifi(boolean ucretsiz_wifi) {
        this.ucretsiz_wifi = ucretsiz_wifi;
    }

    public boolean isYuzme_havuzu() {
        return yuzme_havuzu;
    }

    public void setYuzme_havuzu(boolean yuzme_havuzu) {
        this.yuzme_havuzu = yuzme_havuzu;
    }

    public boolean isFitness_center() {
        return fitness_center;
    }

    public void setFitness_center(boolean fitness_center) {
        this.fitness_center = fitness_center;
    }

    public boolean isHotel_concirge() {
        return hotel_concirge;
    }

    public void setHotel_concirge(boolean hotel_concirge) {
        this.hotel_concirge = hotel_concirge;
    }

    public boolean isSpa() {
        return spa;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    public boolean isOda_servisi_7_24() {
        return oda_servisi_7_24;
    }

    public void setOda_servisi_7_24(boolean oda_servisi_7_24) {
        this.oda_servisi_7_24 = oda_servisi_7_24;
    }
}
