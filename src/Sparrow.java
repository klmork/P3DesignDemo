import java.awt.*;

public class Sparrow implements Bird, FlyingCreature{
    private Point location;
    private int wingSpan;
    private int numEggs;

    public Sparrow() { }
    public Sparrow(Point p, int w, int n) {
        location = p;
        wingSpan = w;
        numEggs = n;
    }

    public void announceSelf() {
        System.out.println("I am a sparrow");
    }

    public void fly() {
        System.out.println("I am flying");
        location.x += 5;
    }

    public void bragAboutEggs() {
        System.out.println("I'm so great - I have " + numEggs + " eggs.  Evolution is favoring me.");
    }

    public void bragAboutWingspan() {
        System.out.println("I have a " + wingSpan + " foot wingspan");
    }
}
