import java.awt.*;

public class Parrot extends FlyingCreature {

    public Parrot(Point p, int w, int n) {
        super(p, w, n);
    }

    public void announceSelf() {
        System.out.println("I am a Parrot");
    }

    public int getAmount() { return 3; }


    public void bragAboutWingspan() {
        super.bragAboutWingspan();
        System.out.println("I also can talk if you were wondering");
    }
}
