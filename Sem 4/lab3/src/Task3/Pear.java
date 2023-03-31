package Task3;

public class Pear extends Fruit {
    public Pear(double weight) {
        super(weight);
    }
    public double getCost() {
        return this.getWeight() * 5;
    }
}
