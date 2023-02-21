public class BD {
    public String name;
    public int age;
    public int weight;
    public int height;
    public BD(String str) {
        String[] arr = str.split("; ");
        this.name = arr[0];
        this.age = Integer.parseInt(arr[1]);
        this.weight = Integer.parseInt(arr[2]);
        this.height = Integer.parseInt(arr[3]);
    }
    public void show() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nHeight: " + height);
    }
    public void newName(String name) {
        this.name = name;
        System.out.println("New name: " + this.name);
    }
    public void newAge(int age) {
        this.age = age;
        System.out.println("New age: " + this.age);
    }
    public void newWeight(int weight) {
        this.weight = weight;
        System.out.println("New weight: " + this.weight);
    }
    public void newHeight(int height) {
        this.height = height;
        System.out.println("New height: " + this.height);
    }
    public void checkInfo(String str) {
        String[] arr = str.split("; ");
        System.out.println("Checking name... - " + ((this.name.equals(arr[0])) ? "True" : "False"));
        System.out.println("Checking age... - " + ((this.age == Integer.parseInt(arr[1])) ? "True" : "False"));
        System.out.println("Checking weight... - " + ((this.weight == Integer.parseInt(arr[2])) ? "True" : "False"));
        System.out.println("Checking height... - " + ((this.height == Integer.parseInt(arr[3])) ? "True" : "False"));
    }
}
