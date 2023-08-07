package Ders_08;

import java.util.Scanner;

public class M_04_Ornek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("- Hesap Makinesine Hoş Geldiniz!");
        System.out.println("- İşlem Seçenekleri:");
        System.out.println("- Toplama işlemi 1 ");
        System.out.println("- Çıkarma işlemi 2 ");
        System.out.println("- Çarpma  işlemi 3 ");
        System.out.println("- Bölme   işlemi 4 ");
        System.out.println("- Çıkış   işlemi 0 ");

        System.out.print("Bir seçenek giriniz : ");
        int secim = scanner.nextInt();

        if (secim == 0) {
            System.out.println("Hesap Makinesi kapatılıyor...");
        } else if (secim >= 1 && secim <= 4) {
            System.out.print("Birinci sayıyı girin: ");
            double sayi1 = scanner.nextDouble();

            System.out.print("İkinci sayıyı girin: ");
            double sayi2 = scanner.nextDouble();

            double sonuc = 0;

            switch (secim) {
                case 1:
                    sonuc = sayi1 + sayi2;
                    System.out.println("Sonuç: " + sonuc);
                    break;
                case 2:
                    sonuc = sayi1 - sayi2;
                    System.out.println("Sonuç: " + sonuc);
                    break;
                case 3:
                    sonuc = sayi1 * sayi2;
                    System.out.println("Sonuç: " + sonuc);
                    break;
                case 4:
                    if (sayi2 != 0) {
                        sonuc = sayi1 / sayi2;
                        System.out.println("Sonuç: " + sonuc);
                    } else {
                        System.out.println("Bölme işlemi için ikinci sayı sıfır olamaz!");
                    }
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız.");
                    break;
            }
        } else {
            System.out.println("Geçersiz bir seçim yaptınız.");
        }


    }
}
