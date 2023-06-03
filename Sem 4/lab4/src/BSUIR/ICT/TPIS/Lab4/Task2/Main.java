package BSUIR.ICT.TPIS.Lab4.Task2;

import java.util.TreeSet;

public class Main {
    public static void runTask2() {
        NumTreeSet tree = new NumTreeSet();
        tree.addNum(3.0);
        tree.addNum(5.0);
        tree.addNum(1.0);
        tree.addNum(10.0);
        tree.addNum(6);
        tree.addNum(5);
        tree.addNum(1);
        System.out.println(tree);
        System.out.println(tree.getMap());
        System.out.println(tree.findNum(5));
        System.out.println(tree.findNum(8));
        System.out.println(tree.findNum(-2));
        tree.removeNum(5);
        tree.removeNum(1);
        tree.removeNum(1);
        System.out.println(tree);
        System.out.println(tree.getMap());
        System.out.println(tree.findNum(5));
        System.out.println(tree.findNum(8));
        System.out.println(tree.findNum(-2));
    }
}
