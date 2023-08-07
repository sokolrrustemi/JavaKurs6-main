package Ders_21;

public class TerminalRenkliBar {
    public static void main(String[] args) {


        int i = 0;

        while (i < 51) {

            for (int j = 0; j < i; j++) {
                System.out.print("\u001B[42m \u001B[0m");
            }
            for (int j = 0; j < 50 - i; j++) {

                System.out.print("\u001B[43m \u001B[0m");
//                try {
//                    Thread.sleep(300);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
            System.out.print(" " + i * 2 + "%");


            if (i < 50) {
                System.out.print("\r");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } i++;
        }
        System.out.println();
    }
}
