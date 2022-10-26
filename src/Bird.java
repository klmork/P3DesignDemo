public interface Bird {
    default void bragAboutEggs() {
        System.out.println("I'm so great - I have " + getNumEggs() + " eggs.  Evolution is favoring me.");
    }

    int getNumEggs();
    void bragAboutWingspan();
    void announceSelf();
}
