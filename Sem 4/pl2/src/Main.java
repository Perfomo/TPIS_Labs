import java.util.Scanner;
public class Main {
    public static void task_1() {
        Student_1 std_1 = new Student_1();
        std_1.nameStudent = "Name_1";
        std_1.numberCourse = 1;
        Student_1 std_2 = new Student_1();
        std_2.numberCourse = 2;
        std_2.nameStudent = "Name_2";
        System.out.println("\nStudent 1 info:\nName: " + std_1.nameStudent + "\nCourse: " + std_1.numberCourse);
        System.out.println("\nStudent 2 info:\nName: " + std_2.nameStudent + "\nCourse: " + std_2.numberCourse);
    }
    public static void task_2() {
        Student_1 ivanov = new Student_1();
        ivanov.nameStudent = "Name_1";
        Student_1 petrov = ivanov;
        System.out.println("\nStudent ivanov info:\nName: " + ivanov.nameStudent);
        System.out.println("\nStudent petrov info:\nName: " + petrov.nameStudent);
        ivanov.nameStudent = "New name";
        System.out.println("\nStudent ivanov info:\nName: " + ivanov.nameStudent);
        System.out.println("\nStudent petrov info:\nName: " + petrov.nameStudent);
    }
    public static void task_3() {
        Student_1 ivanov = new Student_1();
        ivanov.nameStudent = "Ivanov";
        ivanov.numberCourse = 4;
        ivanov.show();
    }
    public static void task_4() {
        Student_1 ivanov = new Student_1();
        ivanov.nameStudent = "Petya";
        ivanov.numberCourse = 2;
        System.out.println("Average mark is " + ivanov.ave_mark_test());
    }
    public static void task_5(Scanner sc) {
        Student_1 ivanov = new Student_1();
        ivanov.nameStudent = "Petya";
        ivanov.numberCourse = 2;
        System.out.println("Input 5 nums: ");
        int[] mas = new int[5];
        for(int i = 0; i < 5; i++) {
            mas[i] = sc.nextInt();
        }
        System.out.println("Average mark is " + ivanov.ave_mark(mas));
    }
    public static void task_6() {
        Student_1 ivanov = new Student_1();
        ivanov.show();
    }
    public static void task_7() {
        Student_1 ivanov = new Student_1(4, "<><><>");
        ivanov.show();
    }
    public static void task_8() {
        Student_1 ivanov = new Student_1(4, "<|><|><|>",true);
        ivanov.show();
    }
    public static void task_9() {
        System.out.println(Area.area(5.0));
        System.out.println(Area.area(4));
        System.out.println(Area.area(2, 5));
    }
    public static void task_10() {
        Student_1 std_1 = new Student_1();
        Student_1 std_2 = new Student_1(2, "Sasha");
        Student_1 std_3 = new Student_1(4, "Vova", true);
        std_1.show();
        std_2.show();
        std_3.show();
    }
    public static void task_11() {
        Student_1 obj1 = new Student_1(2, "Max");
        Student_1 obj2 = new Student_1(obj1);
        obj1.show();
        obj2.show();
    }
    public static void task_12() {
        Animals obj1 = new Animals();
        Animals obj2 = new Animals(4, 120, 60, "Zebra");
        obj2.info();
        System.out.println("\nanimal1 name == animal2 name? - " + obj2.check_name(obj1));
        obj2.check_const();
    }
    public static void task_13() {
    Matrix arr1 = new Matrix(3);
    Matrix arr2 = new Matrix(3);
    arr1.view();
    System.out.println();
    arr2.view();
    System.out.println();
    arr1.plus(arr2);
    System.out.println("+++++++++++++");
    Matrix mat1 = new Matrix(2, 3);
    Matrix mat2 = new Matrix(2, 3);
    mat1.view();
    System.out.println();
    mat2.view();
    System.out.println();
    mat1.minus(mat2);
    System.out.println("------------");
    Matrix mat3 = new Matrix(3, 2);
    mat2.view();
    System.out.println();
    mat3.view();
    System.out.println();
    mat2.mult(mat3);
    System.out.println();
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
                    case 6 -> task_6();
                    case 7 -> task_7();
                    case 8 -> task_8();
                    case 9 -> task_9();
                    case 10 -> task_10();
                    case 11 -> task_11();
                    case 12 -> task_12();
                    case 13 -> task_13();
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