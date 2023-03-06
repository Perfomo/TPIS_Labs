public class Animals {
    public double weight;
    public int age;
    public String name;
    public void change_info(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println("\nNew name: " + name + "\nNew age: " + age + "\nNew weigh: " + weight);
    }
    public void show_info() {
        System.out.println("\nName: " + name + "\nAge: " + age + "\nWeigh: " + weight);
    }
}
