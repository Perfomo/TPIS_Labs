package Task3;
public class Apple extends Fruit {
    public Apple(double weight) {
        super(weight);
    }
    public double getCost() {
        return this.getWeight() * 3;
    }
}
