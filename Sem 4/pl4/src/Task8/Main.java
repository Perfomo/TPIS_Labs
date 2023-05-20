package Task8;
public class Main {
    public static void runTask8() {
        MyQueue<Integer> myQueue = new MyQueue<>();

        Consumer consumer = new Consumer(myQueue);
        Consumer consumer2 = new Consumer(myQueue);
        Producer producer = new Producer(myQueue);

        Thread t1 = new Thread(consumer);
        Thread t3 = new Thread(consumer2);
        Thread t2 = new Thread(producer);

        t1.setName("Consumer #1");
        t2.setName("Consumer #2");

        t1.start();
        t2.start();
        t3.start();
    }
}
