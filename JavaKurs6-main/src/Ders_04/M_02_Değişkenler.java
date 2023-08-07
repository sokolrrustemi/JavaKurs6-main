package Ders_04;

public class M_02_Değişkenler {
    public static void main(String[] args) {

//        Not: Java, Case Sensitive bir dildir. Yani büyük küçük harf ayrımı vardır.
//        Değişken tanımlamasında kullanacağınız X ile x değişkeni farklıdır.

//        Programımız için gerekli değişkenleri tanımlarken uymamız gereken birkaç kural vardır.
//        Bu kuralları aşağıda maddeler halinde sizlere anlatacağım.

//        Tanımlanacak her değişkenin bir veri tipi olmalıdır.
//        Java değişken tanımlamasını yaparken veri tipi belirtmezsek hata ile karşılaşırız.

        //degisken=5; // Bir veri tipi belirtmediğimiz için hata verir.

//        Bu hata ile karşılaşmamak için değişken tanımlarken veri tipini belirtmemiz gerekmektedir.
        int degisken1=5; // Herhangi bir hata ile karşılaşmayız.

//        Java değişkenleri, değer almadan kullanılamaz. Bir değişken, değer almadan ekrana yazdırılamaz.
        int degisken2;
        //System.out.println(degisken2); // Değişkenin bir değeri olmadığını ileten hata alırız.

        String ad ="Java";
        System.out.println("ad = " + ad);
        char sinif ='1';
        System.out.println("sinif = " + sinif);

        //        Değişken tanımlarken isimler sayı ile ve/veya boşluk barındırmamalıdır.
        //int okul numarasi=453269800; // Hatalı bir kullanım örneği.
//        Bu hataya düsmemek için bu tarz uzun değişken isimlerinde aralarına _ , $ gibi
//        bazı işaretlemeler kullanabiliriz.
        int okul_numarasi=453269800; // Doğru bir kullanım örneği.
        System.out.println(okul_numarasi);


//        Aynı tip değişkenler, aynı satırda kullanılabilir.
//        Bu tarz bir tanımlama yapacak olursak aralarına virgül koyarak
//        tek satırda tanımlama işlemini gerçekleştirebiliriz.
        String isim="Emre",soyisim="il"; // Doğru bir kullanım örneği.
        System.out.println(isim);
        System.out.println(soyisim);
        int degisken3=44,degisken4=21;
        System.out.println(degisken3);
        System.out.println(degisken4);
        System.out.println(degisken4+degisken3);



    }
}
