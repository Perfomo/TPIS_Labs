package Task3;
public class Plum extends Fruit {
    public Plum(double weight) {
        super(weight);
    }
    public double getCost() {
        return this.getWeight() * 1.5;
    }
}
