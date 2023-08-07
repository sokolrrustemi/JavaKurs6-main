package Ders_20;

public class Cember extends Sekil{
    private double yaricap;

    public Cember( double yaricap) {
        super("Çember");
        this.yaricap = yaricap;
    }

    //Soyut yöntem
    @Override
    public double alanHesapla() {
        return Math.PI * this.yaricap * this.yaricap;
    }
}
