package Ders_20;

public class Dikdortgen extends Sekil {

    private double uzunKenar;
    private double kisaKenar;

    public Dikdortgen( double uzunKenar, double kisaKenar) {
        super("Dikdörtgen");
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    //Soyut yöntem
    @Override
    public double alanHesapla() {
        return this.uzunKenar*this.kisaKenar;
    }
}
