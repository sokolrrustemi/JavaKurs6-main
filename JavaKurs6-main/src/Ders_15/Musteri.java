package Ders_15;

public class Musteri {

    private String ad;
    private String soyAd;
    private double bakiye;


    public String getAd() {
        System.out.println("\u001B[32m"+"Musteri Ad: "+this.ad+"\u001B[0m");
        return ad;
    }

    public void setAd(String ad) {
        if (ad.length() >= 2) {
            this.ad = ad;
        }else
            System.out.println("Ad daha uzun olmalı!");

    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        if (soyAd.length() >= 2) {
            this.soyAd = soyAd;
        }else
            System.out.println("Soyad daha uzun olmalı!");
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void hesabaYatir(double miktar) {

        this.bakiye += miktar;
    }

    public void hesaptanCek(double miktar) {

        if (miktar <= this.bakiye) {
            this.bakiye -= miktar;
        } else
            System.out.println("\u001B[1m"+"\u001B[4m"+"\u001B[31m"+miktar+" Harcama yapılamadı!" + " Yetersiz bakiye!"+"\u001B[0m");
    }

}
