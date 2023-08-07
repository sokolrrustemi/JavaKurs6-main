package Ders_21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HataDeneme {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Dizi boyutu girin: ");

            int size = scanner.nextInt();
            int[] numbers = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Dizinin " + (i + 1) + ". elemanını girin: ");
                numbers[i] = scanner.nextInt();
            }

            System.out.print("Toplamını bulmak istediğiniz indexleri giriniz : ");
            int index1 = scanner.nextInt();
            int index2 = scanner.nextInt();
            int sum = numbers[index1] + numbers[index2];
            System.out.println("Toplam : " + sum);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hata: Geçersiz dizin indexi girişi!");

        }
        catch (InputMismatchException e){

            System.out.println("Hata: Geçersiz veri tipi girişi!");
        }
        catch (Exception e){

            System.out.println("Beklenmeyen bir hata oluştu : " + e.getMessage());
        }

        finally {
            scanner.close();
            System.out.println("Program sonlandırılıyor..");
        }


    }

}
