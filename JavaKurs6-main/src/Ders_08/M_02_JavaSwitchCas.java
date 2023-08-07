package Ders_08;

import java.util.Scanner;

public class M_02_JavaSwitchCas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Haftanın günlerini rakamla giriniz : ");
        int day = scanner.nextInt();
        String dayType;
        String dayString;

        switch (day){
            case 1 :  dayString = "Pazartesi" ;break;
            case 2 :  dayString = "Salı" ;break;
            case 3 :  dayString = "Çarşamba" ;break;
            case 4 :  dayString = "Perşembe" ;break;
            case 5 :  dayString = "Cuma" ;break;
            case 6 :  dayString = "Cumartesi" ;break;
            case 7 :  dayString = "Pazar" ;break;
            default:  dayString = "Geçersiz gün";break;

        }
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:dayType = " Hafta içi"; break;
            case 6:
            case 7:dayType = " Hafta sonu"; break;
            default: dayType="Geçersiz gün türü";
        }
        System.out.println(dayString + " Bir " + dayType + " Günüdür.");

    }
}
