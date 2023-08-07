package Ders_20;

abstract class Sekil {
    private String tur;

    public Sekil(String tur) {
        this.tur = tur;
    }

    //Soyut yöntem
    public abstract double alanHesapla ();

    //Somut yöntem
    public void ekranaYazdir(){
        System.out.print("Bu bir "+ this.tur+"'dir. ");
    }


}
