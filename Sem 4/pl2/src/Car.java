import  java.util.Scanner;
public class Car {
    public int speed;
    public String color;
    public Car() {
    }
    public Car(Car ob) {
        this.speed = ob.speed;
        this.color = ob.color;
    }
    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }
    public void create() {
        System.out.println("Input spped");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            speed = sc.nextInt();
        }
        System.out.println("INput color");
        sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            color = sc.nextLine();
        }
    }
    public void show() {
        System.out.println("Speed = " + speed + ", color=" + color);
    }
    public double time(double length) {
        return  length/speed;
    }
    public static Car[] createMas(int n) {
        Car mas[] = new Car[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new Car();
            mas[i].create();
        }
        return mas;
    }
    public static void showMas(Car[] mas) {
        for(int i = 0; i < mas.length; i++) {
            mas[i].show();
        }
    }
    public static  Car bestCar(Car[] mas) {
        Car best = mas[0];
        for(int i =0; i < mas.length; i++) {
            if(mas[i].speed > best.speed) {
                best = mas[i];
            }
        }
        return best;
    }
}
