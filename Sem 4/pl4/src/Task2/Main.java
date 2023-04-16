package Task2;

public class Main {
    public static void runTask2() {
        Queue.get();
        Queue<String> el1 = new Queue<>("hi");
        Queue.top = Queue.last = el1;
        Queue.top.set(123);
        el1.set(23.7);
        Queue.top.printInfo();
        Queue.get();
        Queue.top.printInfo();
    }
}

