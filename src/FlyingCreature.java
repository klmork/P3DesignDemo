import java.awt.*;

public abstract class FlyingCreature extends Bird{
    private Point location;

    public FlyingCreature(Point l, int w, int n) {
        super(w, n);
        this.location = l;
    }
    public void fly() {
        System.out.println("I am flying");
        location.x += getAmount();
    }

    abstract int getAmount();

}
