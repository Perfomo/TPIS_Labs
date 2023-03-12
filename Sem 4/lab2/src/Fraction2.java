public class Fraction2 {
    public int m;
    public int n;
    public Fraction2(int m, int n) {
        this.m = m;
        this.n = n;
    }
    public Fraction2() {
        this.m = (int)(Math.random() * (51 - 1) + 1);
        this.n = (int)(Math.random() * (51 - 1) + 1);
    }
    public void reset(int m, int n) {
        this.m = m;
        this.n = n;
    }
    public void show() {
        System.out.println("\nM: " + this.m + "\nN: " + this.n);
    }
    public void cut() {
        for(int k = 2; k <= Math.abs(this.m) && k <= Math.abs(this.n); k++){
            if(this.m % k == 0 && this.n % k == 0) {
                this.m /= k;
                this.n /= k;
                k = 1;
            }
        }
        if(this.m < 0 && this.n < 0) {
            this.m = Math.abs(this.m);
            this.n = Math.abs(this.n);
        }
    }
    public void sum(Fraction2... arr) {
        int buf = this.n;
        for(int i = 0; i < arr.length; i++) {
            buf *= arr[i].n;
        }
        this.m = this.m * (buf / this.n);
        for(int i = 0; i < arr.length; i++) {
            this.m = this.m + (arr[i].m * (buf / arr[i].n));
        }
        this.n = buf;
        this.cut();
    }
    public void min(Fraction2 obj) {
        this.m = this.m * obj.n - obj.m * this.n;
        this.n = this.n * obj.n;
        this.cut();
    }
    public void mult(Fraction2... arr) {
        for(int i = 0; i < arr.length; i++) {
            this.m *= arr[i].m;
            this.n *= arr[i].n;
        }
        this.cut();
    }
    public void div(Fraction2 obj) {
        this.m *= obj.n;
        this.n *= obj.m;
        this.cut();
    }
    public static void idk(Fraction2[] arr) {
        System.out.print(arr[0].m + "/" + arr[0].n + "  ");
        for(int i = 2; i < arr.length; i += 2) {
            arr[i-1].sum(arr[i]);
            System.out.print(arr[i-1].m + "/" + arr[i-1].n + "  " + arr[i].m + "/" + arr[i].n + "  ");
        }
        if(arr.length % 2 == 0) {
            System.out.print(arr[arr.length-1].m + "/" + arr[arr.length-1].n + "  ");
        }
        System.out.println();
    }
}
