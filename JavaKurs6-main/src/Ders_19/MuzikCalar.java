package Ders_19;

public class MuzikCalar implements IMuzikBoard,ISecenekler {


    @Override
    public void muzikCal() {

        System.out.println("Müzik çal...");

    }

    @Override
    public void sesAC(int volume) {
        System.out.println("Ses "+volume+" seviye yükseltildi...");
    }

    @Override
    public void sesAzalt(int volume) {
        System.out.println("Ses "+volume+" seviye azaltıldı...");
    }

    @Override
    public void stop() {
        System.out.println("Müzik durdu...");
    }

    @Override
    public void pause() {
        System.out.println("Müzik duraklatıldı...");
    }


    @Override
    public void geriSar() {
        System.out.println("10 saniye geri sarıldı...");
    }

    @Override
    public void ileriSar() {
        System.out.println("10 saniye ileri sarıldı..");
    }

    @Override
    public void kayitAl() {
        System.out.println("Kayıt başlatıldı...");
    }

    @Override
    public void kayitDinle() {
        System.out.println("Kayıt dinleniyor...");
    }

    @Override
    public void muzikDegistir() {

        System.out.println("Muzik değiştirildi...");

    }
}
