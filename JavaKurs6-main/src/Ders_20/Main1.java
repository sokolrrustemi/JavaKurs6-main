package Ders_20;

public class Main1 {
    public static void main(String[] args) {


        Sekil dikdortgen = new Dikdortgen(5,3);
        dikdortgen.ekranaYazdir();
        System.out.println("Dikdörtgenin Alanı : "+  dikdortgen.alanHesapla());

        Sekil cember = new Cember(4);
        cember.ekranaYazdir();
        System.out.println("Cemberin Alanı : "+cember.alanHesapla());


    }
}
