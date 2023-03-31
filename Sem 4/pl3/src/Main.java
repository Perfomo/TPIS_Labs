import java.time.Period;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void task_1() {
        Cat c1 = new Cat();
        c1.age = 1;
        c1.name = "Myrk";
        c1.weight = 3;
        c1.rat_amount = 20;
        c1.show_info();
        c1.change_info("Myrk", 2, 3);
        c1.show_info_cat();
    }
    public static void task_2() {
        Cat2 c1 = new Cat2();
        c1.change_info("Myrk2", 1, 3);
        c1.show_info();
        c1.change_info("Myrk", 2, 5);
        c1.change_rat_amount(10000);
        c1.show_info_cat();
    }
    public static void task_3() {
        Cat2 c = new Cat2();
        c.show_info();
        c.show_info_cat();
    }
    public static void task_4() {
        Cat2 c = new Cat2(1, 2, "Cotik", 20);
        c.show_info();
        c.show_info_cat();
    }
    public static void task_5() {
        Kitten k = new Kitten("3:00");
        k.show_info_cat();
        k.show_info();
    }
    public static void task_6() {
        Kitten k = new Kitten("3:00");
        k.show_info_cat();
        k.show_info();
        Kitten k2 = new Kitten(k);
        k2.show_info_cat();
        k2.show_info();
    }
    public static void task_7() {
        Kitten k = new Kitten("3:00");
        k.show_info();
    }
    public static void task_8() {
        Cat3 c = new Cat3();
        Dog d = new Dog();
        c.voice();
        d.voice();
    }
    public static void task_9() {
        Tool[] arr = new Tool[3];
        arr[0] = new Drum(3);
        arr[1] = new Guitar(10);
        arr[2] = new Trumpet(5);
        for(Tool i : arr) {
            i.play();
        }
    }
    public static void task_10() {
        User u1 = new User("Perfomo", "123");
        u1.createQuery();
        User.Query q1 = u1.new Query();
        q1.printToLog();
        User.Query q2 = new User("Us", "3r").new Query();
        q2.printToLog();
    }
    public static void task_11() {
        Food f = new Food();
        Cookable c = new Cookable() {
            public void cook(String str) {
                System.out.println("Let's cook " + str);
            }
        };
        f.prepare(c, "Steak");
    }
    public static boolean check(String login, String password, String confirm_password) {
        String regex = "^[A-Za-z0-9_]{1,19}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        try {
            matcher = pattern.matcher(login);
            if(!matcher.matches()) {
                throw new WrongLoginException();
            }
            else {
                matcher = pattern.matcher(password);
                try {
                    if(!matcher.matches() || !password.equals(confirm_password)) {
                        throw new WrongPasswordException();
                    }
                }
                catch (WrongPasswordException WPE) {
                    System.out.println(WPE);
                    return false;
                }
            }
        }
        catch (WrongLoginException WLE) {
            System.out.println(WLE);
            return false;
        }
        return true;
    }
    public static void task_12() {
        System.out.println("Perfomo\t123qwe\t123qwe - " + check("Perfomo", "123qwe", "123qwe"));
        System.out.println("Perfomo|\t123qwe\t123qwe - " + check("Perfomo|", "123qwe", "123qwe"));
        System.out.println("Perfomo\t123qwe|\t123qwe - " + check("Perfomo", "123qwe|", "123qwe"));
        System.out.println("Perfomo\t123qwe|\t123qwe| - " + check("Perfomo", "123qwe|", "123qwe|"));
        System.out.println("Perfomoooooooooooooo\t123qwe\t123qwe - " + check("Perfomoooooooooooooo", "123qwe", "123qwe"));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nInput task number [1, 12]\n0 - exit");
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
                    case 8 -> task_8();
                    case 9 -> task_9();
                    case 10 -> task_10();
                    case 11 -> task_11();
                    case 12 -> task_12();

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