package Task6;
public class MyRunnable implements Runnable{
    public void run() {
        for(int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException IE) {
                    System.out.println(IE.getMessage());
                }
            }
        }
    }
}
