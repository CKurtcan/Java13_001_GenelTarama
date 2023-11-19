package com.CK.Q6;

public class HavaCanlilari extends Omurgalilar{

    double kanatUzunlgu;
    int ayakSayisi;

    public HavaCanlilari() {
        super();
    }

    public HavaCanlilari(String tur, String ad, String ureme, String hareket, int yas) {
        super(tur, ad, ureme, hareket, yas);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getTur() {
        return super.getTur();
    }

    @Override
    public void setTur(String tur) {
        super.setTur(tur);
    }

    @Override
    public String getAd() {
        return super.getAd();
    }

    @Override
    public void setAd(String ad) {
        super.setAd(ad);
    }

    @Override
    public String getUreme() {
        return super.getUreme();
    }

    @Override
    public void setUreme(String ureme) {
        super.setUreme(ureme);
    }

    @Override
    public String getHareket() {
        return super.getHareket();
    }

    @Override
    public void setHareket(String hareket) {
        super.setHareket(hareket);
    }

    @Override
    public int getYas() {
        return super.getYas();
    }

    @Override
    public void setYas(int yas) {
        super.setYas(yas);
    }

    public double getKanatUzunlgu() {
        return kanatUzunlgu;
    }

    public void setKanatUzunlgu(double kanatUzunlgu) {
        this.kanatUzunlgu = kanatUzunlgu;
    }

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }
}
