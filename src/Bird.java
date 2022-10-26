public interface Bird {
    default void bragAboutEggs() {
        System.out.println("I'm so great - I have " + getNumEggs() + " eggs.  Evolution is favoring me.");
    }
    default void bragAboutWingspan() {
        System.out.println("I have a " + getWingSpan() + " foot wingspan");
    }
    void announceSelf();
    int getWingSpan();
    int getNumEggs();
}
