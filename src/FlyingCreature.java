import java.awt.*;

public interface FlyingCreature {
    default void fly() {
        System.out.println("I am flying");
        getLocation().x += 5;
    }

    Point getLocation();
}
