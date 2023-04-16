package Task3;

import java.util.function.Function;

public class Main {
    public static void runTask3() {
        MyFunction mf = (int x) -> {
            if(x > 0) {
                return "Positive";
            }
            if(x < 0) {
                return "Negative";
            }
            else {
                return "Zero";
            }
        };
        System.out.println(mf.apply(1));
        System.out.println(mf.apply(0));
        System.out.println(mf.apply(-1));
        System.out.println();
        Function<Integer, String> f = x -> {
            if(x > 0) {
                return "Positive";
            }
            if(x < 0) {
                return "Negative";
            }
            else {
                return "Zero";
            }
        };
        System.out.println(mf.apply(1));
        System.out.println(mf.apply(0));
        System.out.println(mf.apply(-1));
    }
}

