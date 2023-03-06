public class Cat extends Animals {
    public int rat_amount;
    public void change_rat_amount(int rat_amount) {
        this.rat_amount = rat_amount;
        System.out.println("\nNew rat amount: " + rat_amount);
    }
    public void show_info_cat() {
        System.out.println("\nName: " + name + "\nAge: " + age + "\nWeigh: " + weight + "\nRat amount: " + rat_amount);
    }
}
