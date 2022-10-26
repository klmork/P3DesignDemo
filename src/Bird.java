public abstract class Bird {
    private int wingSpan;
    private int numEggs;

    public Bird(int w, int n) {
        this.wingSpan = w;
        this.numEggs = n;
    }
    public void bragAboutEggs() {
        System.out.println("I'm so great - I have " + numEggs + " eggs.  Evolution is favoring me.");
    }
    public void bragAboutWingspan() {
        System.out.println("I have a " + wingSpan + " foot wingspan");
    }
    abstract void announceSelf();
}
