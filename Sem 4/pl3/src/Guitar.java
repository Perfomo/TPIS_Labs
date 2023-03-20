public class Guitar implements Tool{
    public int string_amount;
    public void play() {
        System.out.println("\nGuitar is playing with amount of strings: " + string_amount);
    }
    public Guitar(int string_amount) {
        this.string_amount = string_amount;
    }
}
