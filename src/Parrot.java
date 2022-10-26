import java.awt.*;

public class Parrot implements Bird, FlyingCreature{
    private Point location;
    private int wingSpan;
    private int numEggs;

    public Parrot() { }
    public Parrot(Point p, int w, int n) {
        location = p;
        wingSpan = w;
        numEggs = n;
    }

    public void announceSelf() {
        System.out.println("I am a Parrot");
    }

    public void fly() {
        FlyingCreature.super.fly();
        location.x += 3;
    }

    public Point getLocation() { return location; }

    public void bragAboutEggs() {
        System.out.println("I'm so great - I have " + numEggs + " eggs.  Evolution is favoring me.");
    }

    public void bragAboutWingspan() {
        System.out.println("I have a " + wingSpan + " foot wingspan");
        System.out.println("I also can talk if you were wondering");
    }
}
