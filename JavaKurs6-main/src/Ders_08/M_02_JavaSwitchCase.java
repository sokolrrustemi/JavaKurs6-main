package Ders_08;


import java.util.Scanner;

public class M_02_JavaSwitchCase {
    public static void main(String[] args) {

// Java'da Birden Fazla Durum İçeren Break İfadelerinin Çıkarıldığı Switch Case Örneği
        Scanner scanner = new Scanner(System.in);
        System.out.print("Haftanın günlerini rakamla giriniz : ");
        int day = scanner.nextInt();
        String dayType;
        String dayString;

        // Switch case
        switch (day) {
            case 1:dayString = "Pazartesi";break;
            case 2:dayString = "Salı";break;
            case 3:dayString = "Çarşamba";break;
            case 4:dayString = "Perşembe";break;
            case 5:dayString = "Cuma";break;
            case 6:dayString = "Cumartesi";break;
            case 7:dayString = "Pazar";break;
            default:dayString = "Geçersiz gün";        }

        switch (day) {
            // Break ifadesi olmadan birden fazla durum
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Hafta içi";
                break;
            case 6:
            case 7:
                dayType = "Hafta sonu";
                break;

            default:
                dayType = "Geçersiz gün türü";
        }
        System.out.println(dayString + " bir " + dayType + " günüdür.");

    }
}
