package Task1;
public class Main {
    public static void runTask1() {
        Integer[] x = {10, 1, 1};
        Integer[] s = {5, 2, 7};
        TwoNumArrays<Integer, Integer> arr1 = new TwoNumArrays<Integer, Integer>(x,s);
        System.out.println("Arr1 is equal: " + arr1.isEqual());
        arr1.twoArraysFindMaxMin();
        System.out.println("Sum of the first arr1 and first arr2 els: " + arr1.twoNumSum(0, 0));
        System.out.println();

        Double[] t = {10.4, 1.2, 1.7};
        TwoNumArrays<Double, Integer> arr2 = new TwoNumArrays<Double, Integer>(t,s);
        System.out.println("Arr2 is equal: " + arr2.isEqual());
        arr2.twoArraysFindMaxMin();
        System.out.println("Sum of the first arr1 and first arr2 els: " + arr2.twoNumSum(0, 0));
        System.out.println();

        Integer[] l = {10, 1, 1};
        TwoNumArrays<Integer, Integer> arr3 = new TwoNumArrays<Integer, Integer>(x,l);
        System.out.println("Arr3 is equal: " + arr3.isEqual());
        arr3.twoArraysFindMaxMin();
        System.out.println("Sum of the first arr1 and first arr2 els: " + arr3.twoNumSum(0, 0));
    }
}
