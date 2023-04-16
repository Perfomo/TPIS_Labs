package Task2;
public class Queue<T> {
    static Queue<?> top = null;
    static Queue<?> last = null;
    private Queue<?> next;
    private Object body;
    public Queue(Object body) {
        this.body = body;
    }
    public Queue<?> set(Object info) {
        try {
            Queue<?> new_last = new Queue<>(info);
            if(last == null) {
                last = new_last;
            }
            else {
                last.next = new_last;
                last = new_last;
            }
            return new_last;
        }
        catch (OutOfMemoryError OOME)
        {
            System.out.println("No free memory...");
            return null;
        }
    }
    public static Queue<?> get() {
        Queue<?> ptr = top;
        try{
            top = top.next;
        }
        catch (NullPointerException NPE) {
            System.out.println("Queue is empty...");
        }
        ptr = null;
        return top;
    }
    public void printInfo() {
        System.out.println("\nThis obj info: " + this.body + "\nWith body dtype: " + this.body.getClass());
        if(this.next != null) {
            this.next.printInfo();
        }
    }
}
