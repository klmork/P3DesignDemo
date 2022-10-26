import java.awt.*;

public class Penguin implements Bird {
    private int wingSpan;
    private int numEggs;

    public Penguin() { }
    public Penguin(int w, int n) {
        wingSpan = w;
        numEggs = n;
    }
    public void announceSelf() {
        System.out.println("I am a penguin");
    }

    public void bragAboutWingspan() {
        Bird.super.bragAboutWingspan();
        System.out.println("Too bad I can't fly");
    }

    public int getNumEggs() { return numEggs; }
    public int getWingSpan() { return wingSpan; }
}
