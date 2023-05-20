package Task7;

public class Main {
    public static void runTask7() {
        StringBuilder sb = new StringBuilder("a");
        RunnableChar bc = new RunnableChar(sb);

        Thread thread1 = new Thread(bc);
        Thread thread2 = new Thread(bc);
        Thread thread3 = new Thread(bc);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
