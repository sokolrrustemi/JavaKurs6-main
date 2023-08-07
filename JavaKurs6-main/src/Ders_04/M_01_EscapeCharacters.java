package Ders_04;

public class M_01_EscapeCharacters {

    public static void main(String[] args) {

        System.out.println("//*****************************\\\\\n");

//        \t Bir sekme boşluğu ekler.
//        Tab boşluğu, metin içinde bir sekmelik boşluk bırakmak için kullanılır. "\t" kaçış karakteri, bir
//        dizede bir sekme boşluğu oluşturur. Örneğin, aşağıdaki kodda iki sekme boşluğu eklenerek
//        çıktıda metnin belirli bir hizalamada görüntülenmesi sağlanır:

        System.out.println("Bu bir metindir.");
        System.out.println("\tBu bir sekme boşluğu ile girintilenmiş metindir.");

//        Bu bir metindir.
//                Bu bir sekme boşluğu ile girintilenmiş metindir.

//        Bu örnekte, ikinci satırda "\t" kaçış karakteri kullanılarak bir sekme boşluğu oluşturulmuş
//        ve metin girintilenmiştir. Bu, metnin okunabilirliğini artırmak veya belirli bir düzeni korumak
//        için kullanılabilir.


        System.out.println("\n//*****************************\\\\\n");

//        \n Bir Yeni Satır ekler.
//        Yeni satır karakteri(\n), bir dizede yeni bir satır başlatmak için kullanılır.
//        "\n" kaçış karakteri, bir dizedeki yerini aldığında, imleci bir sonraki satırın başına taşır.
//        Bu, metni bir satır sonlandırmak veya yeni bir satıra geçmek için kullanabilirsiniz.

        System.out.print("Bu bir metindir.");
        System.out.print("\nYeni bir satırda olan başka bir metindir.");

//        Bu bir metindir.
//        Yeni bir satırda olan başka bir metindir.

//        Bu örnekte, her \n ifadesi bir dizede yeni bir satır başlatır.
//        İkinci satır, bir önceki satırın altında yeni bir satırda görüntülenir.
//        Bu, metinleri daha okunabilir hale getirmek veya metinleri belirli bir düzeni korumak için kullanılabilir.

        System.out.println("\n\n//*****************************\\\\\n");


//        \\ Ters eğik çizgi ekler.

//        Ters eğik çizgi karakteri () kaçış karakteri olarak kullanıldığında,
//        ardından gelen karakterin özel anlamını kaldırır ve karakterin kendisini gösterir.
//        Örneğin, \ ifadesi bir ters eğik çizgi karakterini () dizede görüntüler.

        String path = "C:\\Users\\Kullanici\\Belgeler\\dosya.txt";
        System.out.println(path);

//        C:\Users\Kullanici\Belgeler\dosya.txt

//        Bu örnekte, çift ters eğik çizgi (\) kullanılarak bir dosya yolu dizesi oluşturulmuştur.
//        İlk ters eğik çizgi, ikinci ters eğik çizgi karakterinin özel anlamını kaldırır ve dizede
//        bir ters eğik çizgi karakterini temsil eder. Böylece, çıktıda tam dosya yolu görüntülenir.

//        Ters eğik çizgi, özel anlamları olan karakterlerin doğrudan görüntülenmesini sağlar ve örneğin
//        dosya yolları veya belirli format gerektiren ifadelerin düzgün şekilde temsil edilmesinde kullanılır.

        System.out.println("\n//*****************************\\\\\n");


//        \r Bir Satır Başı Dönüşü ekler.

//        Satır başı dönüş karakteri (\r), bir dizede imleci bir satırın başına taşır.
//        "\r" kaçış karakteri kullanıldığında, bir sonraki karakterin imleci mevcut satırın başına getirir.

        System.out.println("Bu bir metindir.\rYeni bir satırda olan başka bir metindir.");

//        Yeni bir satırda olan başka bir metindir.

//        Bu örnekte, ikinci satırın başına geçmek için "\r" kaçış karakteri kullanılmıştır.
//        Sonuç olarak, ikinci satırın metni, ilk satırın üzerine yazılarak görüntülenir.
//        Bu, metinleri belirli bir düzen veya format içinde görüntülemek veya üzerine yazmak için kullanılabilir.

//        Ancak, genellikle "\r\n" (satır başı dönüşü ve yeni satır) birleşimi kullanılarak hem satır başı dönüşü
//        hem de yeni satır eklenir. Bu, farklı platformlarda (Windows, Unix, Mac gibi) doğru satır başı davranışını
//        sağlamak için yaygın olarak kullanılan bir yaklaşımdır.

        System.out.println("\n//*****************************\\\\\n");

//        Tek tırnak işareti (') yazdırır.

//        Tek tırnak işareti, metin içinde tek tırnak işaretini göstermek için kullanılır. " ' " kaçış karakteri,
//        bir dizede tek tırnak işaretini temsil eder.

        System.out.println("Bu bir metindir ve içinde 'tek tırnak' bulunmaktadır.");

//        Bu bir metindir ve içinde 'tek tırnak' bulunmaktadır.

//        Bu örnekte, tek tırnak işareti (') kullanılarak bir dizede tek tırnak işareti görüntülenir.
//        Böylece, çıktıda metindeki tek tırnak işareti doğru şekilde gösterilir.


        System.out.println("\n//*****************************\\\\\n");

//        Çift tırnak işareti (") yazdırır.

//        Çift tırnak işareti, metin içinde çift tırnak işaretini göstermek için kullanılır.
//        """ kaçış karakteri, bir dizede çift tırnak işaretini temsil eder.

        System.out.println("Bu bir metindir ve içinde \"çift tırnak\" bulunmaktadır.");

//        Bu bir metindir ve içinde "çift tırnak" bulunmaktadır.

//        Bu örnekte, çift tırnak işareti (") kullanılarak bir dizede çift tırnak işareti görüntülenir.
//        Böylece, çıktıda metindeki çift tırnak işareti doğru şekilde gösterilir.

//        Kaçış karakteri olan \ karakteri, bir karakterin özel anlamını kaldırır ve karakterin kendisini temsil eder.
//        Bu sayede, özel anlama sahip karakterlerin doğrudan görüntülenmesi sağlanır.

        System.out.println("\n//*****************************\\\\");

    }


}
