public abstract class Animals3 {
    private double weight;
    private int age;
    private String name;
    public Animals3(double weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }
    public Animals3(Animals3 obj) {
        this.weight = obj.weight;
        this.age = obj.age;
        this.name = obj.name;
    }
    public Animals3() {
        this.weight = 0;
        this.age = 0;
        this.name = "cattt";
    }
    public void change_info(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println("\nNew name: " + name + "\nNew age: " + age + "\nNew weigh: " + weight);
    }
    public abstract void voice();
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void show_info() {
        System.out.println("\nName: " + name + "\nAge: " + age + "\nWeigh: " + weight);
    }
}
