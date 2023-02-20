import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.sqrt;
public class Main {
    public static void task_2() {
        int c = 10;
        int b = 25;
        System.out.println(4 * (b + c - 1) / 2);
    }
    public static void task_1() {
        System.out.println("Hi" );
    }
    public static void task_3() {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("int: " + i + "\ndouble: " + d);
        b = (byte)i;
        System.out.println("int in byte type: " + b);
        i = (int)d;
        System.out.println("double in int type: " + i);
        b = (byte)d;
        System.out.println("double in byte type: " + b);
    }
    public static void task_4() {
        double f = 3.6;
        System.out.println(Math.round(f));

    }

    public static void task_5(Scanner sc) {
        int res = 0;
        for (int i = -20; i < 21 ; i++)
        {
            if(i % 2 == 0) {
                res =+ i;
            }
        }
        boolean exit = false;

    }

    public static void task_6(Scanner sc) {
        int a = 3, b = 4, c;
        System.out.println("P: " + (a + b + sqrt((a*a + b*b))) + "\nS: " + a*b/2);
    }

    public static void task_7() {
        int a = 10, b =25;
        System.out.println(((int) Math.random() * (b - a) + a));
    }
    public static void task_8() {
        int[] c = new int[15];
        int r = 0;
        for(int i = 0; i < 15; i ++)
        {
            c[i] = (int) (Math.random() * 10);
            System.out.print(c[i] + "  ");
            if (c[i] % 2 == 0)
            {
                r+=1;
            }
        }
    }
    public static void task_9() {
        int[][] f = new int[7][5];
        int max = 0, k = 1, s=0;
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                f[i][j] = (int) (Math.random() * (6 - (-5)) + (-5));
                System.out.print(f[i][j] + "  ");
                k *= Math.abs(f[i][j]);
            }
            System.out.println();
            if (k >= max) {
                max = k;
                s = i;
            }
            k = 1;
        }
        System.out.println("Max index: " + s);
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
                    case 4 -> task_4();
                    case 5 -> task_5(sc);
                    case 6 -> task_6(sc);
                    case 7 -> task_7();
                    case 8 -> task_8();
                    case 9 -> task_9();
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