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
    public static void task_5() {
        Double d = Double.valueOf("3.2");
        String l = "3.33";
        double s = Double.parseDouble(l);
        int k = d.intValue();
        long t = d.longValue();
        short r = d.shortValue();
        float q = d.floatValue();
        byte z = d.byteValue();
        System.out.println("\nDouble: " + d + "\ndouble: " + d + "\nint: " + k + "\nlong: " + t + "\nshort: " + r + "\nfloat: " + q + "\nbyte: " + z);
        String aa = Double.toString(3.14);
        System.out.println("\n" + aa);
    }
    public static void task_4() {
        Fraction2 f1 = new Fraction2(3, 5);
        Fraction2 f2 = new Fraction2(9, 3);
        Fraction2 f3 = new Fraction2(-1, 4);
        System.out.println("\n++++++++++");
        f1.sum(f2, f3);
        f1.show();
        f1.reset(3, 5);
        System.out.println("\n----------");
        f1.min(f2);
        f1.show();
        f1.reset(3, 5);
        f1.min(f3);
        f1.show();
        f1.reset(3, 5);
        System.out.println("\n**********");
        f1.mult(f2, f3);
        f1.show();
        f1.reset(3, 5);
        System.out.println("\n//////////");
        f1.div(f2);
        f1.show();
        f1.reset(3, 5);
        f1.div(f3);
        f1.show();
        f1.reset(3, 5);
        System.out.println("\n{}{}{}{}{}{}");
        int k = (int) (Math.random() * (11 - 3) + 3);
        Fraction2[] arr = new Fraction2[k];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Fraction2();
            arr[i].cut();
            System.out.print(arr[i].m + "/" + arr[i].n + "  ");
        }
        System.out.println();
        Fraction2.idk(arr);
    }
    public static void task_6() {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("\nInput string: ");
        str = sc.nextLine();
        System.out.println("Str: " + str);
        System.out.println("Last char is: " + str.charAt(str.length()-1));
        System.out.println("Str ends with '!!!' - " + (str.endsWith("!!!") ? "True" : "False"));
        System.out.println("Str starts with 'I like' - " + (str.startsWith("I like") ? "True" : "False"));
        System.out.println("Str contains 'Java' - " + (str.contains("Java") ? "True" : "False"));
        System.out.println("Str index of 'Java' - " + str.indexOf("Java"));
        System.out.println("Str with 'o' instead of 'a' - " + str.replaceAll("a", "o"));
        System.out.println("Str in upper case - " + str.toUpperCase());
        System.out.println("Str in lower case - " + str.toLowerCase());
        System.out.println("Str's three first letters - " + str.substring(0,3));
    }
    public static void task_7() {
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(9, 3);
        Fraction f3 = new Fraction(-1, 4);
        System.out.println("\n++++++++++");
        f1.sum(f2, f3);
        f1.reset(3, 5);
        System.out.println("\n----------");
        f1.minus(f2);
        f1.reset(3, 5);
        f1.minus(f3);
        f1.reset(3, 5);
        System.out.println("\n**********");
        f1.mult(f2, f3);
        f1.reset(3, 5);
        System.out.println("\n//////////");
        f1.divi(f2);
        f1.reset(3, 5);
        f1.divi(f3);
        f1.reset(3, 5);
        System.out.println("\n{}{}{}{}{}{}");
        int k = (int) (Math.random() * (11 - 3) + 3);
        Fraction[] arr = new Fraction[k];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new Fraction();
            System.out.print(arr[i].m + "/" + arr[i].n + "  ");
        }
        System.out.println();
        arr = Fraction.idk(arr);
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean exit = false;
    while (!exit) {
        System.out.println("\nInput task number [1, 7]\n0 - exit");
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
                case 4 -> task_4();
                case 5 -> task_5();
                case 6 -> task_6();
                case 7 -> task_7();
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