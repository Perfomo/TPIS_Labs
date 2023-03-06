public class Cat2 extends Animals2 {
    private int rat_amount;
    public Cat2() {
        this.setAge(1);
        this.setWeight(1);
        this.setName("Cat");
        rat_amount = 0;
    }
    public Cat2(int age, double weight, String name, int rat_amount) {
        super(weight, age, name);
        this.rat_amount = rat_amount;
    }
    public void change_rat_amount(int rat_amount) {
        this.rat_amount = rat_amount;
        System.out.println("\nNew rat amount: " + rat_amount);
    }
    public void show_info_cat() {
        System.out.println("\nName: " + this.getName() + "\nAge: " + this.getAge() + "\nWeigh: " + this.getWeight() + "\nRat amount: " + rat_amount);
    }
}
