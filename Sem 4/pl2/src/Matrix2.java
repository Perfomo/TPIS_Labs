public class Matrix2 {
    int m;
    int n;
    public int[] int_ptr;
    public Matrix2[] mat_ptr;
    public Matrix2(int n) {
        this.n = n;
        m = 1;
        int_ptr = new int[n];
        mat_ptr = null;
        for(int j  = 0; j < n; j++) {
            int_ptr[j] = (int) (Math.random() * (11 - (-11)) + (-11));
        }
    }
    public Matrix2(int m, int n) {
        this.m = m;
        this.n = n;
        mat_ptr = new Matrix2[m];
        int_ptr = null;
        for(int i = 0; i < m; i++) {
            mat_ptr[i] = new Matrix2(n);
        }
    }
    public void view() {
        if(this.m > 1) {
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(mat_ptr[i].int_ptr[j] + "  ");
                }
                System.out.println();
            }
            System.out.println("***");
        }
        else {
            for(int j = 0; j < int_ptr.length; j++) {
                System.out.print(int_ptr[j] + "  ");
            }
            System.out.println("\n***");
        }
    }
    public boolean plus(Matrix2 obj) {
        if (this.m > 1 & obj.m > 1) {
            if(this.m == obj.m & this.n == obj.n) {
                for(int i = 0; i < this.m; i++) {
                    for(int j = 0; j < this.n; j++) {
                        System.out.print((this.mat_ptr[i].int_ptr[j] + obj.mat_ptr[i].int_ptr[j]) + "  ");
                    }
                    System.out.println();
                }
                return true;
            }
        }
        else {
            if(this.n == obj.n) {
                for(int j = 0; j < this.n; j++) {
                    System.out.print((this.int_ptr[j] + obj.int_ptr[j]) + "  ");
                }
                System.out.println();
                return true;
            }
        }
        return false;
    }
    public boolean minus(Matrix2 obj) {
        if (this.m > 1 & obj.m > 1) {
            if(this.m == obj.m & this.n == obj.n) {
                for(int i = 0; i < this.m; i++) {
                    for(int j = 0; j < this.n; j++) {
                        System.out.print((this.mat_ptr[i].int_ptr[j] - obj.mat_ptr[i].int_ptr[j]) + "  ");
                    }
                    System.out.println();
                }
                return true;
            }
        }
        else {
            if(this.n == obj.n) {
                for(int j = 0; j < this.n; j++) {
                    System.out.print((this.int_ptr[j] - obj.int_ptr[j]) + "  ");
                }
                System.out.println();
                return true;
            }
        }
        return false;
    }
    public boolean mult(Matrix2 obj) {
        if(this.n == obj.m) {
            for(int i = 0; i < this.m; i++) {
                for(int k = 0; k < obj.n; k++) {
                    int res = 0;
                    for(int j = 0; j < this.n; j++) {
                        res += (this.mat_ptr[i].int_ptr[j] * obj.mat_ptr[j].int_ptr[k]);
                    }
                    System.out.print(res + "  ");
                }
                System.out.println();
            }
            return true;
        }
        else {
            return false;
        }
    }
}
