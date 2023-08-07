package Ders_11;

public class M_02_Metots {
    public static void main(String[] args) {
        int[] dizi = new int[5];

        diziElemanEkle(dizi); // Dizi elemanlarını ekleyen metot çağrısı
        System.out.println("\u001B[32m"+"**Dizi Eleman Ekleme işlemi yapıldı**"+"\u001B[0m");

        System.out.print("\u001B[31m"+"Dizi Elemanları: "+"\u001B[0m");
        diziYazdir(dizi); // Dizi elemanlarını ekrana yazdıran metot çağrısı

        int toplam = diziToplam(dizi); // Dizi elemanlarının toplamını hesaplayan metot çağrısı
        System.out.println("\u001B[33m"+"Dizi Toplamı: " + toplam+"\u001B[0m");

        double ortalama = diziOrtalama(dizi); // Dizi elemanlarının ortalamasını hesaplayan metot çağrısı
        System.out.println("\u001B[35m"+"Dizi Ortalaması: " + ortalama+"\u001B[0m");

        int enBuyuk = enBuyukEleman(dizi); // Dizi içindeki en büyük elemanı bulan metot çağrısı
        System.out.println("\u001B[1m"+"\u001B[4m"+"\u001B[34m"+"En Büyük Eleman: " + enBuyuk+"\u001B[0m");
    }

    // Diziye random eleman ekleyen metot
    public static void diziElemanEkle(int[] dizi) {

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * (100 + 1));
            
        }

    }

    // Dizi elemanlarını ekrana yazdıran metot
    public static void diziYazdir(int[] dizi) {
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }
        System.out.println();
    }

    // Dizi elemanlarının toplamını hesaplayan metot
    public static int diziToplam(int[] dizi) {
        int toplam = 0;
        for (int eleman : dizi) {
            toplam += eleman;
        }
        return toplam;
    }

    // Dizi elemanlarının ortalamasını hesaplayan metot
    public static double diziOrtalama(int[] dizi) {
        int toplam = diziToplam(dizi); // diziToplam metodu kullanılarak toplam hesaplanır
        double ortalama = (double) toplam / dizi.length;
        return ortalama;
    }

    // Dizi içindeki en büyük elemanı bulan metot
    public static int enBuyukEleman(int[] dizi) {
        int enBuyuk = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }
        return enBuyuk;
    }
}
