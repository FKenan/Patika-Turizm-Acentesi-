package com.PatikaTurizm.model;

import com.PatikaTurizm.Helper.DBConnector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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

    public static ArrayList<Otel> getList() {
        ArrayList<Otel> otelList =new ArrayList<>();
        Otel obj ;

        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM otel");

            while (rs.next()){
                obj= new Otel();
                obj.setAdres(rs.getString("adres"));
                obj.setOtel_adi(rs.getString("otel_adi"));
                obj.setEposta(rs.getString("eposta"));
                obj.setTelefon(rs.getString("telefon"));
                obj.setOtel_id(rs.getInt("otel_id"));
                obj.setYildiz(rs.getInt("yildiz"));

                otelList.add(obj);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return otelList;
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