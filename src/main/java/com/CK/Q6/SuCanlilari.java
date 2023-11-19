package com.CK.Q6;

public class SuCanlilari extends Omurgalilar {

    int yuzgecSayisi;
    String yuzgecTipi;

    public SuCanlilari() {
        super();
    }

    public SuCanlilari(String tur, String ad, String ureme, String hareket, int yas) {
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

    public int getYuzgecSayisi() {
        return yuzgecSayisi;
    }

    public void setYuzgecSayisi(int yuzgecSayisi) {
        this.yuzgecSayisi = yuzgecSayisi;
    }

    public String getYuzgecTipi() {
        return yuzgecTipi;
    }

    public void setYuzgecTipi(String yuzgecTipi) {
        this.yuzgecTipi = yuzgecTipi;
    }
}
