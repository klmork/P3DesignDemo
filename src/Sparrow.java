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
        FlyingCreature.super.fly();
        location.x += 5;
    }

    public Point getLocation() { return location; }
    public int getNumEggs() { return numEggs; }
    public int getWingSpan() { return wingSpan; }
}
