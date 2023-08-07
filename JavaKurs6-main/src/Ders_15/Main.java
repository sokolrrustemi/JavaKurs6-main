package Ders_15;

public class Main {

    public static void main(String[] args) {

        Musteri musteri = new Musteri();
        musteri.setAd("Techno");
        musteri.setSoyAd("Study");
        musteri.setBakiye(700);

        musteri.getAd();
        System.out.println(musteri.getSoyAd());
        System.out.println(musteri.getBakiye());

        musteri.hesabaYatir(500.0);
        System.out.println(musteri.getBakiye());

        musteri.hesaptanCek(2000.0);
        System.out.println(musteri.getBakiye());




    }

}
