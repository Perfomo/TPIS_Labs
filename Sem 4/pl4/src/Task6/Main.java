package Task6;
public class Main {
    public static void runTask6() {
        MyRunnable myRunnable = new MyRunnable();
        NewThread thread = new NewThread(myRunnable);

        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);

        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread.join();
            thread1.join();
            thread2.join();
            thread3.join();
        }
        catch (InterruptedException IE) {
            System.out.println(IE.getMessage());
        }
    }
}
