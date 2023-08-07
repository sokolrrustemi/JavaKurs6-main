package Ders_11;

public class M_01_2DArrays {
    public static void main(String[] args) {


        int[][] farkliBoyutlar = new int[2][];
        farkliBoyutlar[0] = new int[3]; // İlk satırda 3 sütun
        farkliBoyutlar[1] = new int[6]; // İkinci satırda 5 süt

        for (int k = 0; k < 2; k++) {

            for (int i = 0; i < farkliBoyutlar.length; i++) { // satır sayısı

                for (int j = 0; j < farkliBoyutlar[i].length; j++) { // sütun sayısı
                    farkliBoyutlar[i][j] = (int) (Math.random() * (100 + 1));
                }
            }
            for (int i = 0; i < farkliBoyutlar.length; i++) { // satır sayısı

                for (int j = 0; j < farkliBoyutlar[i].length; j++) { // sütun sayısı
                    System.out.print(farkliBoyutlar[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("****************");
        }
    }
}
