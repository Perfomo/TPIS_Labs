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
        int x = (int) (Math.random() * (11 - 1) + 1);
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
    public static void task_7() {
        int result = 0;
        for(int i = 1001; i < 1000000; i++){
            int i1 = i / 100000 % 10;
            int i2 = i / 10000 % 10;
            int i3 = i / 1000 % 10;
            int i4 = i / 100 % 10;
            int i5 = i / 10 % 10;
            int i6 = i % 10;
            if(i1 + i2 + i3 == i4 + i5 + i6) {
                result++;
            }
        }
        System.out.println("Result is " + result);
    }
    public static void task_9() {
        int x = (int) (Math.random() * (156 - 5) + 5);
        System.out.println("Random number: " + x);
        if(x >= 26 & x <= 99) {
            System.out.println("X in (25, 100)");
        }
        else {
            System.out.println("X not in (25, 100)");
        }
    }
    public static void task_10() {
        int rand_num = (int) (Math.random() * 28801);
        System.out.println("Random num is " + rand_num);
        int h = rand_num / 3600;
        int temp = rand_num % 3600;
        int m = temp / 60;
        int s = temp % 60;
        System.out.println("Work time remain: " + h + " hours " + m + " min " + s + " sec ");
    }
    public static void task_11() {
        int[] arr = new int[12];
        int max = -15, last_i_max = -1;
        for(int i = 0; i < 12; i++) {
            int num = (int) (Math.random() * (16 - (-15)) + (-15));
            arr[i] = num;
            if(num >= max) {
                max = num;
                last_i_max = i;
            }
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\nMax value is " + max + " with last index " + last_i_max);
    }
    public static void task_12(Scanner sc) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nInput num in [3, 50]");
            if(sc.hasNextInt()) {
                int num = sc.nextInt();
                if(num >= 3 & num <= 50) {
                    int[] arr = new int[num];
                    String s = "";
                    for(int i = 0; i < num; i++) {
                        int t = (int) (Math.random() * (num+1));
                        arr[i] = t;
                        s = (t % 2 == 0) ? (s + t + " ") : s;
                        System.out.print(t + " ");
                    }
                    System.out.println();
                    String[] arr2 = s.split(" ");
                    for(int i = 0; i < arr2.length; i++) {
                        System.out.print(arr2[i] + " ");
                    }
                    System.out.println();
                    exit = true;
                }
                else {
                    System.out.println("Num must be in [3, 50]");
                }
            }
            else {
                System.out.println("Not a number...");
                sc.next();
            }
        }
    }
    public static void task_13() {
        int[][] mat = new int[9][9];
        int x, y, r;
        String s_x_arr;
        String s_y_arr = "1 2 3 4 5 6 7 8";
        String[] s_y;
        for(int i = 0; i < 9; i++) {
            mat[0][i] = i + 1;
            mat[i][0] = i + 1;
        }
        for(int i = 0; i < 15; i++) {
            s_y = s_y_arr.split(" ");
            s_x_arr = "";
            r = (int) (Math.random() * (s_y.length - 1) + 1);
            r = Integer.parseInt(s_y[r]);
            for(int k = 1; k < 9; k++) {
                if(mat[r][k] == 0) {
                    s_x_arr += (k + " ");
                }
            }
            if(s_x_arr != "") {
                String[] s_x = s_x_arr.split(" ");
                y = r;
                r = (int) (Math.random() * (s_x.length - 1) + 1);
                r = Integer.parseInt(s_x[r]);
                x = r;
                mat[y][x] = 1;
                mat[x][y] = 1;
                System.out.println(y + " * " + x);
            }
            else {
                String s = "";
                for(int t = 0; t < s_y.length; t++) {
                    if(s_y[t] != s_y[r]) {
                        s += (s_y[t] + " ");
                    }
                }
                s_y_arr = s;
            }
        }




//        for(int i = 0; i < 9; i++) {
//            for(int k = 0; k < 9; k++) {
//                System.out.print(mat[i][k] + "   ");
//            }
//            System.out.println();
//        }
    }
    public static void task_14() {
        int n = 0, m = 0;
        while (n == m) {
            n = (int) (Math.random() * (8 - 1) + 1);
            m = (int) (Math.random() * (8 - 1) + 1);
        }
        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                mat[i][j] = (int) (Math.random() * (51 - (-50)) + (-50));
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++) {
            int max = mat[i][0], min = mat[i][0], max_i = 0, min_i = 0;
            for(int j = 0; j < m; j++) {
                if(mat[i][j] > max) {
                    max = mat[i][j];
                    max_i = j;
                }
                if(mat[i][j] < min) {
                    min = mat[i][j];
                    min_i = j;
                }
            }
            int temp = mat[i][0];
            mat[i][0] = max;
            mat[i][max_i] = temp;
            temp = mat[i][m-1];
            mat[i][m-1] = min;
            mat[i][min_i] = temp;
        }
        System.out.println("-----------------------------------");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
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
                    case 1 -> task_1(sc);
                    case 2 -> task_2(sc);
                    case 3 -> task_3(sc);
                    case 4 -> task_4(sc);
                    case 5 -> task_5();
                    case 6 -> task_6();
                    case 7 -> task_7();
                    case 8 -> System.out.println("Ex 8 was missed");
                    case 9 -> task_9();
                    case 10 -> task_10();
                    case 11 -> task_11();
                    case 12 -> task_12(sc);
                    case 13 -> task_13();
                    case 14 -> task_14();
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