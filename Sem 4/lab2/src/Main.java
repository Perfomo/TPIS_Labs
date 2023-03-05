import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void task_1() {
        Circle c1 = new Circle(2, 2, 2);
        c1.show();
        c1.change_r(5);
        c1.change_x_y(5, 5);
        c1.show();
        System.out.println("S: " + c1.square() + "\nL: " + c1.len());
    }
    public static void task_2() {
        Storage s1 = new Storage(5, 1);
        Storage s2 = new Storage(3, 2);
        Storage s3 = new Storage(2, 3);
        s2.change_amount(5);
        s2.change_cost(1);
        System.out.println("Cost: " + s3.get_all_cost());
        s3.compare_cost(s1);
        System.out.println("All amount: " + Storage.get_all_amount(s1, s2, s3));
    }
    public static void task_3() {
        Book b1 = new Book("Max", "Linux", 2021, 100);
        b1.get_info("ffsgs");
        b1.get_info("Linux");
        b1.change_author("Eva");
        b1.change_name("Linux...");
        b1.change_year(2022);
        b1.change_amount();
        b1.get_info("Linux...");
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean exit = false;
    while (!exit) {
        System.out.println("\nInput task number [1, 14]\n0 - exit");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            switch (i) {
                case 0 -> {
                    System.out.println("\nHave a nice day!!!");
                    exit = true;
                }
                case 1 -> task_1();
                case 2 -> task_2();
                case 3 -> task_3();
                default -> System.out.println("\nError...");
            }
        }
        else {
            System.out.println("Input int pls...");
            sc.next();
        }
        }
    }
}