package Ders_07;


import java.util.Scanner;

public class M_02_JavaIf {

    public static void main(String[] args) {

        // Gün içindeki zamana göre bize bildirim veren program

        int saat = 14;

        if (saat < 12) {
            System.out.println("Günaydın!");
        } if (saat >= 12 && saat < 18) {
            System.out.println("İyi günler!");
        } if (saat >= 18) {
            System.out.println("İyi akşamlar!");
        }

        // soru

       // Kullanıcıdan bir sayı alan ve bu sayının pozitiflik, çiftlik ve 4 ile tam
        // bölünebilme durumunu kontrol eden bir Java programı yazınız.


        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi > 0) {
            System.out.println("Sayı pozitif");
            if (sayi % 2 == 0) {
                System.out.println("Sayı çift");
                if (sayi % 4 == 0) {
                    System.out.println("Sayı dört ile tam bölünür");
                }
                if (sayi % 4 != 0) {
                    System.out.println("Sayı dört ile tam bölünmez");
                }
            }
            if (sayi % 2 != 0) {
                System.out.println("Sayı tek");
            }
        }
        if (sayi < 0) {
            System.out.println("Sayı negatif");
        }
        if (sayi == 0) {
            System.out.println("Sayı sıfır");
        }


    }
}
