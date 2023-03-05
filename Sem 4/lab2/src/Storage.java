public class Storage {
    public int amount;
    public double cost;
    public Storage() {
        this.amount = 0;
        this.cost = 0;
    }
    public Storage(int amount, double cost) {
        this.amount = amount;
        this.cost = cost;
    }
    public void change_amount(int amount) {
        this.amount = amount;
        System.out.println("New amount: " + amount);
    }
    public void change_cost(double cost) {
        this.cost = cost;
        System.out.println("New cost: " + cost);
    }
    public double get_all_cost() {
        return cost * amount;
    }
    public void compare_cost(Storage obj) {
        if(this.cost > obj.cost) {
            System.out.println("This obj cost is bigger...");
        }
        else {
            System.out.println("This obj cost is lower...");
        }
    }
    public static int get_all_amount(Storage... arr) {
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            res += arr[i].amount;
        }
        return res;
    }
}
