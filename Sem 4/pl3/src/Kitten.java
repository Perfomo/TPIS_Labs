public class Kitten extends Cat2{
    public String time;
    public Kitten(Kitten obj) {
        super(obj);
        this.time = obj.time;
    }
    public Kitten(String time) {
        super(1, 2, "Kit", 0);
        this.time = time;
    }
    public void show_info() {
        super.show_info();
        System.out.println("Time: " + time);
    }
}
