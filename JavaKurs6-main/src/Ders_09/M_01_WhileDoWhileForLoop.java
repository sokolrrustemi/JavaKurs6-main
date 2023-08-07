package Ders_09;

import java.util.Scanner;

public class M_01_WhileDoWhileForLoop {
    public static void main(String[] args) {

        {
            int i = 0;
            while (i < 10) {
                System.out.println(i);
                i++;
            }
        }

        {
            int i = 1;
            do {
                System.out.println(i);
                i++;
            } while (i <= 5);
        }

        {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }



    }
}
