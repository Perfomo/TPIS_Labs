public class Fraction {
    public double m;
    public double n;
    public Fraction() {
        m = (int)(Math.random() * (51 - 1) + 1);
        n = (int)(Math.random() * (51 - 1) + 1);
    }
    public Fraction(double m, double n) {
        this.m = m;
        this.n = n;
    }
    public void show() {
        System.out.println("\nM: " + this.m + "\nN: " + this.n);
    }
    public void reset(double m, double n) {
        this.m = m;
        this.n = n;
    }
    public void cut(double res) {
        res = Math.round(res * 100.0) / 100.0;
        int i = 0;
        double buf = res, n;
        while (buf != (int)buf) {
            i++;
            buf *= 10;
        }
        n = Math.pow(10, i);
        for(int k = 2; k <= Math.abs(buf) && k <= n; k++){
            if(buf % k == 0 && n % k == 0) {
                buf /= k;
                n /= k;
                k = 2;
            }
        }
        this.m = buf;
        this.n = n;
    }
    public void sum(Fraction... arr) {
        double res = this.m / this.n;
        for(int i = 0; i < arr.length; i++) {
            res += arr[i].m / arr[i].n;
        }
        this.cut(res);
        this.show();
    }
    public void minus(Fraction obj) {
        this.cut(this.m / this.n - obj.m / obj.n);
        this.show();
    }
    public void mult(Fraction... arr) {
        double res = this.m / this.n;
        for(int i = 0; i < arr.length; i++) {
            res *= arr[i].m / arr[i].n;
        }
        this.cut(res);
        this.show();
    }
    public void divi(Fraction obj) {
        this.cut((this.m / this.n) * (obj.n / obj.m));
        this.show();
    }
    public static Fraction[] idk(Fraction[] arr) {
        for(int i = 2; i < arr.length; i += 2) {
            arr[i-1].sum(arr[i]);
        }
        for(int i = 0; i < arr.length; i += 1) {
            System.out.print(arr[i].m + "/" + arr[i].n + "  ");
        }
        System.out.println();
        return arr;
    }
}
