public class Trumpet implements Tool {
    public int diameter;
    public void play() {
        System.out.println("\nTrumpet is playing with diameter: " + diameter);
    }
    public Trumpet(int diameter) {
        this.diameter = diameter;
    }
}
