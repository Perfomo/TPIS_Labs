package Task7;
public class RunnableChar extends Thread {
    StringBuilder sb;
    public RunnableChar(StringBuilder sb) {
        this.sb = sb;
    }
    public synchronized void run() {
        System.out.println("Working " + this.getName());
        for(int i = 0; i < 100; i++) {
            System.out.println(sb.toString());
        }
        int k = (int) sb.charAt(0);
        sb.deleteCharAt(0);
        k+=1;
        sb.append((char) k);
        System.out.println("Stopped working... new char: " + sb.toString());
    }
}
