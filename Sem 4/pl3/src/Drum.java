public class Drum implements Tool {
    public int size;
    public void play() {
        System.out.println("\nDrum is playing with size: " + size);
    }
    public Drum(int size) {
        this.size = size;
    }
}
