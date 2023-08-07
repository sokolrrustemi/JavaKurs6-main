package Ders_08;

public class M_03_Ornek {
    public static void main(String[] args) {
// Java'da Yerleşik Switch Case İfadeleri Örneği
// Dıştaki bir switch'in ifade dizisinin bir parçası olarak bir switch kullanabiliriz.
// Buna iç içe geçmiş bir switch denir. Bir switch ifadesi kendi bloğunu tanımladığı için içteki switch'teki
// durum sabitleriyle dıştaki switch'teki durum sabitleri arasında çakışma olmaz.

        String Branch = "CSE";
        int year =2;

        switch (year) {
            case 1:
                System.out.println("seçmeli dersler: İleri İngilizce, Cebir");break;
            case 2: switch (Branch) {
                    case "CSE":
                    case "CCE":
                        System.out.println("seçmeli dersler: Makine Öğrenimi, Büyük Veri");break;
                    case "ECE":System.out.println("seçmeli dersler: Uydu Mühendisliği");break;
                    default:
                        System.out.println("Seçmeli dersler: Optimizasyon");
                }
        }

    }
}
