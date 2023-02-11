import java.util.Scanner;
public class Main {
    public static void task_1(Scanner sc) {
        System.out.println("Input n: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int res = 1;
            for (int i = 0; i < 4; i++) {
                System.out.print((res *= n) + "   ");
            }
            System.out.println();
        }
        else {
            System.out.println("Error... Input num!");
            sc.next();
        }
    }
    public static void task_2(Scanner sc) {
        boolean exit = false;
        while(!exit) {
            System.out.println("\nU need to input password.\nPassword: 1111");
            if(sc.hasNextInt()) {
                int num = sc.nextInt();
                if(num == 1111) {
                    exit = true;
                    System.out.println("Good job!");
                }
                else {
                    System.out.println("Wrong password...");
                }
            }
            else {
                System.out.println("Not a number...");
                sc.next();
            }
        }
    }
    public static void task_3(Scanner sc) {
        System.out.println("\nInput number of digits in a number: ");
        if(sc.hasNextInt()) {
            int n = sc.nextInt();
            if(n >= 1 & n <= 4) {
                int num1 = (int)Math.pow(10, n-1);
                int num2 = (int)Math.pow(10, n);
                int res = 0;
                while (num1 < num2) {
                    res += num1;
                    num1 += 1;
                }
                System.out.println("Result is " + res);
            }
            else {
                System.out.println("Number must be in [1,4]");
            }
        }
        else {
            System.out.println("Not a number...");
            sc.next();
        }
    }
    public static void task_4(Scanner sc) {
        System.out.println("U need to guess a number x. x in [1, 10]");
        int x = (int) (Math.random() * (10 - 1) + 1);
        int num = 0;
        while(num != x) {
            if(sc.hasNextInt()) {
                num = sc.nextInt();
                if(num >= 1 & num <= 10) {
                    if(num == x) {
                        System.out.println("\nGood job!\n" + x + " = " + num);
                    }
                    else {
                        if(num > x) {
                            System.out.println("\nx < " + num);
                        }
                        else {
                            System.out.println("\nx > " + num);
                        }
                    }
                }
                else {
                    System.out.println("Ur num must be in [1, 10]");
                }
            }
            else {
                System.out.println("Not a number...");
                sc.next();
            }
        }
    }
    public static void task_5() {
        int num1 = 1000, num2 = 10000;
        while (num1 < num2) {
            System.out.print(num1 + "  ");
            num1 += 3;
        }
        System.out.println();
    }
    public static void task_6() {
        // 0 1 1 3 5 8 13 21 34 55 89 144 ...
        int[] arr = new int[10];
        System.out.print( (arr[0] = 1) + "  " + (arr[1] = 1) + "  ");
        for (int i = 2; i < 10; i++) {
            System.out.print((arr[i] = arr[i-2] + arr[i-1]) + "  ");
        }
        System.out.println(arr[9] + arr[8]);
    }
//    public static void task_7(Scanner sc) {
//
//    }
    public static void task_9() {
        int x = (int) (Math.random() * (155 - 5) + 5);
        System.out.println("Random number: " + x);
        if(x >= 26 & x <= 99) {
            System.out.println("X in (25, 100)");
        }
        else {
            System.out.println("X not in (25, 100)");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nInput task number [1, 14]\n0 - exit");
            if (sc.hasNextInt()) {
                int i = sc.nextInt();
                switch (i){
                    case 0:
                        System.out.println("\nHave a nice day!!!");
                        exit = true;
                        break;
                    case 1:
                       task_1(sc);
                       break;
                    case 2:
                        task_2(sc);
                        break;
                    case 3:
                        task_3(sc);
                        break;
                    case 4:
                        task_4(sc);
                        break;
                    case 5:
                        task_5();
                        break;
                    case 6:
                        task_6();
                        break;
//                    case 7:
//                        task_7(sc);
//                        break;
                    case 8:
                        System.out.println("Ex 8 was missed");
                        break;
                    case 9:
                        task_9();
                        break;
                    default:
                        System.out.println("\nError...");
                }
            }
            else {
                System.out.println("Input int pls...");
                sc.next();
            }
        }
    }
}