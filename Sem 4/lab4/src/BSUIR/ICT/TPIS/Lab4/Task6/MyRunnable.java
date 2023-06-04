package BSUIR.ICT.TPIS.Lab4.Task6;

public class MyRunnable implements Runnable {
    private boolean[] arr;
    public void main() {
        Thread th1 = new Thread(this);
        Thread th2 = new Thread(this);
        Thread th3 = new Thread(this);
        Thread th4 = new Thread(this);
        Thread th5 = new Thread(this);

        th1.setName("0");
        th2.setName("1");
        th3.setName("2");
        th4.setName("3");
        th5.setName("4");

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }

    public MyRunnable(boolean[] arr) {
        super();
        this.arr = arr;
        this.main();
    }
    public synchronized boolean getLeftFork() {
        int left_ = Integer.parseInt(Thread.currentThread().getName()) - 1;
        if(left_ < 0) {
            left_ = 4;
        }
        if (arr[left_]) {
            arr[left_] = false;
            return true;
        }
        return false;
    }

    public synchronized boolean getRightFork() {
        int right_ = Integer.parseInt(Thread.currentThread().getName());
        if (arr[right_]) {
            arr[right_] = false;
            return true;
        }
        return false;
    }
    public synchronized boolean isTwoForks() {
        boolean isRight = this.getRightFork(), isLeft = this.getLeftFork();
        if(isRight & isLeft) {
            return true;
        }
        else {
            if(isRight) {
                this.putRightFork();
            }
            if(isLeft) {
                this.putLeftFork();
            }
            return false;
        }
    }
    public  void eat() {
        if(isTwoForks()) {
            System.out.println(Thread.currentThread().getName() + " is eating...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            this.putRightFork();
            this.putLeftFork();
            System.out.println(Thread.currentThread().getName() + "stop eating...");
        }
        else {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void speaking() {
        System.out.println(Thread.currentThread().getName() + " is speaking...");
    }

    public synchronized void putLeftFork() {
        int left_ = Integer.parseInt(Thread.currentThread().getName()) - 1;
        if(left_ < 0) {
            left_ = 4;
        }
        if (!arr[left_]) {
            arr[left_] = true;
        }
    }
    public synchronized void putRightFork() {
        int right_ = Integer.parseInt(Thread.currentThread().getName());
        if (!arr[right_]) {
            arr[right_] = true;
        }
    }

    public void run() {
        while (true){
            this.speaking();
            this.eat();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
