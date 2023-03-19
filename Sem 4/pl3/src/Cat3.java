public class Cat3 extends Animals3 {
    private int rat_amount;
    public Cat3() {
        this.setAge(1);
        this.setWeight(1);
        this.setName("Cat");
        rat_amount = 0;
    }
    public Cat3(Cat3 obj) {
        super(obj);
        this.rat_amount = obj.rat_amount;
    }
    public Cat3(int age, double weight, String name, int rat_amount) {
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
    public void show_info() {
        super.show_info();
        System.out.println("Rat amount: " + rat_amount);
    }
    public void voice() {
        System.out.println("\nMeow :3");
    }
}
