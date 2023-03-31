package Task3;
public abstract class Fruit {
    private double weight;
    public abstract double getCost();
    public Fruit(double weight) {
        this.weight = weight;
    }
    public void printManufacturerInfo() {
        System.out.print("Made in RB");
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
