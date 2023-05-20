import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nInput task number [1, 8]\n0 - exit");
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                switch (i) {
                    case 0 -> {
                        System.out.println("\nHave a nice day!!!");
                        exit = true;
                    }
                    case 1 -> Task1.Main.runTask1();
                    case 2 -> Task2.Main.runTask2();
                    case 3 -> Task3.Main.runTask3();
                    case 4 -> Task4.Main.runTask4();
                    case 5 -> Task5.Main.runTask5();
                    case 6 -> Task6.Main.runTask6();
                    case 7 -> Task7.Main.runTask7();
                    case 8 -> Task8.Main.runTask8();
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