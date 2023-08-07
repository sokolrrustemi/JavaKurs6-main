package Ders_19;

public interface IMuzikBoard {

    int sesSeviyesi = 5;

    void muzikCal();

    void sesAC(int volume);

    void sesAzalt(int volume);

    void stop();
    void pause();

}
