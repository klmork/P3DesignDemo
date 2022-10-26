import java.awt.Point;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Bird penguin = new Penguin(5, 5);
        Bird sparrow = new Sparrow(new Point(0, 0), 5, 20);
        Bird parrot = new Parrot(new Point(0, 0), 5, 20);

        List<Bird> birds = new ArrayList<>(Arrays.asList(new Bird[]{penguin, sparrow, parrot}));

        for (Bird b: birds) {
            System.out.println("-------------------------------");
            b.announceSelf();
            b.bragAboutEggs();
            b.bragAboutWingspan();
            if (b instanceof FlyingCreature) {
                ((FlyingCreature)b).fly();
            }
        }
    }
}