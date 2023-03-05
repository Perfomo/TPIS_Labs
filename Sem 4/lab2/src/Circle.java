public class Circle {
    public double r;
    public int x;
    public int y;
    public Circle() {
        this.r = 2;
        this.x = 1;
        this.y = 1;
    }
    public Circle(double r) {
        this.r = r;
    }
    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Circle(double r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }
    public void show() {
        System.out.println("Radius: " + r + "\nX: " + x + "\nY: " + y);
    }
    public void change_x_y(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("New x is " + x + "\nNew y is " + y);
    }
    public void change_r(double r) {
        this.r = r;
        System.out.println("New r is " + r);
    }
    public double square() {
        return 2 * Math.PI * r * r;
    }
    public double len() {
        return 2 * Math.PI * r;
    }
}
