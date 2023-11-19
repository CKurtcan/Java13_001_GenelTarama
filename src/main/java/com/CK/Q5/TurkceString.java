package com.CK.Q5;

public class TurkceString {
    private String sentence;

    public TurkceString(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return "TurkceString{" +
                "sentence='" + sentence + '\'' +
                '}';
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void karakterAl(int index) {
        if (index >= 0 && index < sentence.length()) {
            System.out.println(sentence.charAt(index));
        } else {
            System.out.println("Geçersiz index: " + index);
        }
    }

    public int indexBul (String karakter){
        return karakter.indexOf(karakter);
    }

    public String altlfade(int baslangic,int bitis){
        return sentence.substring(baslangic,bitis);

    }

    public boolean karakterKontrol(String karakter){
        if (sentence.contains(karakter))
            return true;
        else
            return false;
    }

    public boolean baslangicKontrol(String karakter){
        if (sentence.startsWith(karakter))
            return true;
        else
            return false;
    }

    public boolean bitisKontrol(String karakter){
        if (sentence.endsWith(karakter))
            return true;
        else
            return false;
    }

    public String stringBuyutme(){
            sentence = sentence.toUpperCase();
            return sentence;
    }

    public String stringKucultme(){
        sentence = sentence.toLowerCase();
        return sentence;
    }
}
