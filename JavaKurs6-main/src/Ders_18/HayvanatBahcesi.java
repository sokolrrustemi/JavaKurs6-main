package Ders_18;

public class HayvanatBahcesi {
    public static void main(String[] args) {

    Hayvan hayvan1 = new Kedi();
    Hayvan hayvan2 = new Kopek();

    hayvan1.sesCikar();
    hayvan2.sesCikar();

    hayvan1.besle();
    hayvan2.besle("Kemik");

    hayvan1.sesCikar("miyav");
    hayvan1.sesCikar(5);
    hayvan1.sesCikar();

    Math.max(2,3);




    }
}
