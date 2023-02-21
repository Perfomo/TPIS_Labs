public class Vargs {
    public static void show(int... arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
    public static int sum(int... arr) {
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return res;
    }
    public static int mult(int... arr) {
        int res = 1;
        for(int i = 0; i < arr.length; i++) {
            res *= arr[i];
        }
        return res;
    }
    public static int[] bub_sort(int... arr) {
        int temp;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
