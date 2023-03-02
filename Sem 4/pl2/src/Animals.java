public class Animals {
    static final int AGE = 5;
    static final int WEIGHT = 50;
    static final int HEIGHT = 120;
    public String name;
    public int age;
    public int weight;
    public int height;
    public Animals() {
        this.age = 0;
        this.height = 10;
        this.name = "Nameless";
        this.weight = 5;
    }
    public Animals(int age, int height, int weight, String name) {
        this.weight = weight;
        this.name = name;
        this.height = height;
        this.age = age;
    }
    public void info() {
        System.out.println("Animal info: " + "\nWeight: " + weight + "\nHeight: " + height + "\nAge: " + age + "\nName: " + name);
    }
    public boolean check_name(Animals obj) {
        return (this.name.equals(obj.name));
    }
    public void check_const() {
        if(this.age > AGE) {
            System.out.println("Animal age > " + AGE);
        }
        else {
            if (this.age < AGE) {
                System.out.println("Animal age < " + AGE);
            }
            else {
                System.out.println("Animal age = " + AGE);
            }
        }
        if(this.weight > WEIGHT) {
            System.out.println("Animal weight > " + WEIGHT);
        }
        else {
            if (this.weight < WEIGHT) {
                System.out.println("Animal weight < " + WEIGHT);
            }
            else {
                System.out.println("Animal weight = " + WEIGHT);
            }
        }
        if(this.height > HEIGHT) {
            System.out.println("Animal height > " + HEIGHT);
        }
        else {
            if (this.height < HEIGHT) {
                System.out.println("Animal height < " + HEIGHT);
            }
            else {
                System.out.println("Animal height = " + HEIGHT);
            }
        }
    }
}
