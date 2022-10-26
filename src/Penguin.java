import java.awt.*;

public class Penguin extends Bird {

    public Penguin(int w, int n) {
        super(w, n);

    }

    public void announceSelf() {
        System.out.println("I am a penguin");
    }

    public void bragAboutWingspan() {
        super.bragAboutWingspan();
        System.out.println("Too bad I can't fly");
    }
}
