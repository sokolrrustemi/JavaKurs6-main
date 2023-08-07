package Ders_18;

public class Hayvan {

 int sayi = 1;
    public void sesCikar(){

        System.out.println("Hayvanın sesi : ...");

    }
    public void sesCikar(String ses){

        System.out.println(ses);

    }
    public void sesCikar(int sesSeviyesi){

        System.out.println(sesSeviyesi);

    }
    public void besle() {

        System.out.println("Hayvan beslendi.");
    }

    public  void besle(String yiyecek){
        System.out.println("Hayvan "+yiyecek+" ile beslendi.");
    }

    public  void besle(String yiyecek, String su){
        System.out.println("Hayvan "+yiyecek+" ile beslendi.");
    }



}
