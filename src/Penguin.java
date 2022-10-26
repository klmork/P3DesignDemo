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
    public void bragAboutEggs() {
        System.out.println("I'm so great - I have " + numEggs + " eggs.  Evolution is favoring me.");
    }

    public void bragAboutWingspan() {
        System.out.println("I have a " + wingSpan + " foot wingspan");
        System.out.println("Too bad I can't fly");
    }
}
