import java.awt.*;

public class Sparrow extends FlyingCreature{


    public Sparrow(Point p, int w, int n) {
        super(p, w, n);
    }

    public void announceSelf() {
        System.out.println("I am a sparrow");
    }

    public int getAmount() { return 5; }




}
