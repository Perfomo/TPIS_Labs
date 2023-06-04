package BSUIR.ICT.TPIS.Lab4.Task6;

public class Person extends Thread{
    public Boolean left;
    public Boolean right;
    private Boolean[] arr;
    public Person(boolean[] arr) {
        super();
    }
    public void getLeftFork() {
        int left_ = Integer.parseInt(Thread.currentThread().getName()) - 1;
        if(left_ < 0) {
            left_ = 4;
        }
        synchronized (arr[left_]) {
            if (arr[left_]) {
                this.left = arr[left_];
                arr[left_] = false;
            }
        }

    }

    public void getRightFork() {
        int right_ = Integer.parseInt(Thread.currentThread().getName()) + 1;
        if(right_ > 4) {
            right_ = 0;
        }
        if (arr[right_]) {
            this.left = arr[right_];
            arr[right_] = false;
        }
    }


}
