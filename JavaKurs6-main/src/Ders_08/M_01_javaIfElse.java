package Ders_08;

import java.util.Scanner;

public class M_01_javaIfElse {
    public static void main(String[] args) {

//        Java'da "if-else" ifadesi, programın belirli koşullara göre farklı işlemler yapmasınısağlayan
//        bir kontrol yapısıdır. "if" ve "else" ifadeleri, belirli bir koşulun doğru veya yanlış
//        olduğunu kontrol eder ve buna göre farklı kod bloklarının çalışmasını sağlar.

        // girilen sayının pazitif mi negatif mi olduğunu sorgulayan program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();
        if (sayi > 0) {
            System.out.println("Sayı pozitiftir.");
        } else {
            System.out.println("Sayı negatif veya sıfırdır.");
        }

    }
}
