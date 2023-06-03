import java.util.Scanner;
public class Main {
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
                    case 1 -> BSUIR.ICT.TPIS.Lab4.Task1.Main.runTask1();
                    case 2 -> BSUIR.ICT.TPIS.Lab4.Task2.Main.runTask2();
                    case 3 -> BSUIR.ICT.TPIS.Lab4.Task3.Main.runTask3();
                    case 4 -> BSUIR.ICT.TPIS.Lab4.Task4.Main.runTask4();
                    default -> System.out.println("\nError...");
                }
            }
            else {
                System.out.println("\nInput int pls...");
                sc.next();
            }
        }
    }
}