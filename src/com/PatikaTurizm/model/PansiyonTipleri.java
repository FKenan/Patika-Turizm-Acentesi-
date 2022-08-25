package com.PatikaTurizm.model;

public class PansiyonTipleri {
    private int pansiyon_tip_id;
    private int otel_id;
    private boolean ultra_hersey_dahil;
    private boolean hersey_dahil;
    private boolean oda_kahvalti;
    private boolean tam_pansiyon;
    private boolean yarim_pansiyon;
    private boolean sadece_yatak;
    private boolean alkol_haric_full_credit;

    public PansiyonTipleri() {}

    public PansiyonTipleri(int pansiyon_tip_id, int otel_id, boolean ultra_hersey_dahil, boolean hersey_dahil,
                           boolean oda_kahvalti, boolean tam_pansiyon, boolean yarim_pansiyon,
                           boolean sadece_yatak, boolean alkol_haric_full_credit) {
        this.pansiyon_tip_id = pansiyon_tip_id;
        this.otel_id = otel_id;
        this.ultra_hersey_dahil = ultra_hersey_dahil;
        this.hersey_dahil = hersey_dahil;
        this.oda_kahvalti = oda_kahvalti;
        this.tam_pansiyon = tam_pansiyon;
        this.yarim_pansiyon = yarim_pansiyon;
        this.sadece_yatak = sadece_yatak;
        this.alkol_haric_full_credit = alkol_haric_full_credit;
    }

    public int getPansiyon_tip_id() {
        return pansiyon_tip_id;
    }

    public void setPansiyon_tip_id(int pansiyon_tip_id) {
        this.pansiyon_tip_id = pansiyon_tip_id;
    }

    public int getOtel_id() {
        return otel_id;
    }

    public void setOtel_id(int otel_id) {
        this.otel_id = otel_id;
    }

    public boolean isUltra_hersey_dahil() {
        return ultra_hersey_dahil;
    }

    public void setUltra_hersey_dahil(boolean ultra_hersey_dahil) {
        this.ultra_hersey_dahil = ultra_hersey_dahil;
    }

    public boolean isHersey_dahil() {
        return hersey_dahil;
    }

    public void setHersey_dahil(boolean hersey_dahil) {
        this.hersey_dahil = hersey_dahil;
    }

    public boolean isOda_kahvalti() {
        return oda_kahvalti;
    }

    public void setOda_kahvalti(boolean oda_kahvalti) {
        this.oda_kahvalti = oda_kahvalti;
    }

    public boolean isTam_pansiyon() {
        return tam_pansiyon;
    }

    public void setTam_pansiyon(boolean tam_pansiyon) {
        this.tam_pansiyon = tam_pansiyon;
    }

    public boolean isYarim_pansiyon() {
        return yarim_pansiyon;
    }

    public void setYarim_pansiyon(boolean yarim_pansiyon) {
        this.yarim_pansiyon = yarim_pansiyon;
    }

    public boolean isSadece_yatak() {
        return sadece_yatak;
    }

    public void setSadece_yatak(boolean sadece_yatak) {
        this.sadece_yatak = sadece_yatak;
    }

    public boolean isAlkol_haric_full_credit() {
        return alkol_haric_full_credit;
    }

    public void setAlkol_haric_full_credit(boolean alkol_haric_full_credit) {
        this.alkol_haric_full_credit = alkol_haric_full_credit;
    }
}
