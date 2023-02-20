public class Matrix {
    public int m;
    public int n;
    public int[][] ptr;
    public Matrix(int n) {
        this.n = n;
        this.m = 1;
        this.ptr = new int[this.m][this.n];
        for(int i = 0; i < this.m; i++) {
            for(int j = 0; j < this.n; j++) {
                this.ptr[i][j] = (int) (Math.random() * 6);
            }
        }
    }
    public Matrix(int m, int n) {
        this.n = n;
        this.m = m;
        this.ptr = new int[this.m][this.n];
        for(int i = 0; i < this.m; i++) {
            for(int j = 0; j < this.n; j++) {
                this.ptr[i][j] = (int) (Math.random() * 6);
            }
        }
    }
    public void view() {
        for(int i = 0; i < this.m; i++) {
            for(int j = 0; j < this.n; j++) {
                System.out.print(this.ptr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public boolean plus(Matrix obj) {
        if(this.m == obj.m & this.n == obj.n) {
            for(int i = 0; i < this.m; i++) {
                for(int j = 0; j < this.n; j++) {
                    System.out.print((this.ptr[i][j] + obj.ptr[i][j]) + "  ");
                }
                System.out.println();
            }
            return true;
        }
        else {
            return false;
        }
    }
    public boolean minus(Matrix obj) {
        if(this.m == obj.m & this.n == obj.n) {
            for(int i = 0; i < this.m; i++) {
                for(int j = 0; j < this.n; j++) {
                    System.out.print((this.ptr[i][j] - obj.ptr[i][j]) + "  ");
                }
                System.out.println();
            }
            return true;
        }
        else {
            return false;
        }
    }
    public boolean mult(Matrix obj) {
        if(this.n == obj.m) {
            for(int i = 0; i < this.m; i++) {
                for(int k = 0; k < obj.n; k++) {
                    int res = 0;
                    for(int j = 0; j < this.n; j++) {
                        res += (this.ptr[i][j] * obj.ptr[j][k]);
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
