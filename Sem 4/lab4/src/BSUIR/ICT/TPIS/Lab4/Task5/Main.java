package BSUIR.ICT.TPIS.Lab4.Task5;
public class Main {
    public static void runTask5() {
        MyRunnable mr = new MyRunnable();

        Thread th1 = new Thread(mr);
        Thread th2 = new Thread(mr);
        Thread th3 = new Thread(mr);

        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
            th2.join();
            th3.join();
        }
        catch (InterruptedException IE) {
            System.out.println(IE.getMessage());
        }
    }
}
