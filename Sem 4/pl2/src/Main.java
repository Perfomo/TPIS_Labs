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
    public static void task_13_2_19() {
        Matrix2 arr1 = new Matrix2(3);
        Matrix2 arr2 = new Matrix2(3);
        Matrix2 arr0 = new Matrix2(4);
        Matrix2 mat1 = new Matrix2(2, 3);
        Matrix2 mat2 = new Matrix2(2, 3);
        Matrix2 mat0 = new Matrix2(3, 3);
        arr0.view();
        arr1.view();
        arr2.view();
        mat0.view();
        mat1.view();
        mat2.view();
        System.out.println("+++++++++++");
        arr1.plus(arr2);
        arr0.plus(arr2);
        System.out.println("/////");
        mat0.plus(mat1);
        mat1.plus(mat2);
        System.out.println("-----------");
        arr1.view();
        arr2.view();
        arr0.view();
        mat0.view();
        mat1.view();
        mat2.view();
        arr1.minus(arr2);
        arr0.minus(arr2);
        System.out.println("/////");
        mat0.minus(mat1);
        mat1.minus(mat2);
        System.out.println("*************");
        mat0.view();
        mat1.view();
        mat2.view();
        arr0.mult(arr1);
        mat0.mult(mat0);
        mat0.mult(mat2);
    }
    public static void task_14() {
        Vargs.show(3, 7, 10, 1, 7, 9);
        System.out.println(Vargs.sum(3, 7, 10, 1, 7, 9));
        System.out.println(Vargs.mult(3, 7, 10, 1, 7, 9));
        int[] arr = Vargs.bub_sort(3, 7, 10, 1, 7, 9);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
    public static void task_15() {
        String[] arr = {"top ML books.", "AI so powerful.", "Hi, im ...", "///----///"};
        System.out.println(StrAlg.Str2ToSub(arr, 0, 2));
        String[] arr1 = {"aAbBcCdD", "ML is $bad&$&$ & amazing$nope&"};
        arr1 = StrAlg.delUpper(arr1, 0);
        arr1 = StrAlg.delBetChars(arr1, 1, '$', '&');
    }
    public static void task_16() {
        BD p1 = new BD("Max; 12; 30; 120");
        p1.show();
        System.out.println();
        p1.checkInfo("Lena; 20; 50; 174");
        System.out.println();
        p1.newName("Lena");
        p1.newAge(20);
        p1.newWeight(50);
        p1.newHeight(174);
        System.out.println();
        p1.checkInfo("Lena; 20; 50; 174");
        System.out.println();
        p1.show();
    }
    public static void task_17(Scanner sc) {
        Color k;
        k = Color.RED;
        k.show();
        System.out.println("Input num(1-4): ");
        k.chose(sc.nextInt());
    }
    public static void par_task_1() {
        Car mas[] = Car.createMas(3);
        Car.showMas(mas);
        Car best = Car.bestCar(mas);
        System.out.println("kfjsf");
        best.show();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nInput task number [1, 17]\n0 - exit");
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
                    case 14 -> task_14();
                    case 15 -> task_15();
                    case 16 -> task_16();
                    case 17 -> task_17(sc);
                    case 19 -> task_13_2_19();
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