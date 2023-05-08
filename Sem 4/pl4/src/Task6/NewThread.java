package Task6;

public class NewThread extends Thread {
    public NewThread(MyRunnable r) {
        super(r);
    }
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("^");
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException IE) {
                System.out.println(IE.getMessage());
            }
        }
    }
}
