package com.CK.Q6;

public class Hayvanlar {

    String tur;
    String ad;
    String ureme;
    String hareket;
    int yas;

    public Hayvanlar() {
    }

    public Hayvanlar(String tur, String ad, String ureme, String hareket, int yas) {
        this.tur = tur;
        this.ad = ad;
        this.ureme = ureme;
        this.hareket = hareket;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Hayvanlar{" +
                "tur='" + tur + '\'' +
                ", ad='" + ad + '\'' +
                ", ureme='" + ureme + '\'' +
                ", hareket='" + hareket + '\'' +
                ", yas=" + yas +
                '}';
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getUreme() {
        return ureme;
    }

    public void setUreme(String ureme) {
        this.ureme = ureme;
    }

    public String getHareket() {
        return hareket;
    }

    public void setHareket(String hareket) {
        this.hareket = hareket;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

}
