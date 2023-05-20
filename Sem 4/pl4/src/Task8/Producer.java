package Task8;
public class Producer implements Runnable {
    private MyQueue<Integer> myQueue;

    public Producer(MyQueue<Integer> myQueue) {
        this.myQueue = myQueue;
    }

    public void run() {
        for(int i = 0; i < 100; i--) {
            myQueue.put(i);
        }
    }
}
