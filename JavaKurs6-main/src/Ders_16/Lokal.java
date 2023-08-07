package Ders_16;

import Ders_15.Musteri;

public class Lokal extends Musteri {

    private String ad;
    private String soyAd;
    private String tcNo;
    private String uyelikTarihi;
    private int siraNo;
    private String adres;
    private int yas;
    private String telNo;

    public Lokal() {

    }

    public Lokal(String ad, String soyAd, String tcNo, String uyelikTarihi, int siraNo, String adres, int yas, String telNo) {

        setAd(ad);
        setSoyAd(soyAd);
        setTcNo(tcNo); // 11 rakamlı olmalı
        setUyelikTarihi(uyelikTarihi); // güncel yıldan fazla giremez
        setSiraNo(siraNo);
        setAdres(adres);
        setYas(yas);
        setTelNo(telNo);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        if (tcNo.length()==11){
        this.tcNo = tcNo;
        }
        else
            System.out.println("T.C. No Hatalı!");
    }

    public String getUyelikTarihi() {
        return uyelikTarihi;
    }

    public void setUyelikTarihi(String uyelikTarihi) {
        int tarih = Integer.parseInt(uyelikTarihi.substring(uyelikTarihi.length()-4));
        if (tarih<=2023) {
            this.uyelikTarihi = uyelikTarihi;
        }
        else System.out.println("Geçersiz Tarih girildi!");
    }

    public int getSiraNo() {
        return siraNo;
    }

    public void setSiraNo(int siraNo) {
        this.siraNo = siraNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return "Lokal{" +
                "ad='" + getAd() + '\'' +
                ", soyAd='" + getSoyAd() + '\'' +
                ", tcNo='" + getTcNo() + '\'' +
                ", uyelikTarihi='" + getUyelikTarihi() + '\'' +
                ", siraNo=" + getSiraNo() +
                ", adres='" + getAdres() + '\'' +
                ", yas=" + getYas() +
                ", telNo='" + getTelNo() + '\'' +
                '}';
    }
}
