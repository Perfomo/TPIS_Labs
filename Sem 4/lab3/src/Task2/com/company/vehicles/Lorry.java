package Task2.com.company.vehicles;

import Task2.com.company.details.Engine;
import Task2.com.company.professions.Driver;

public class Lorry extends Car {
    private double carrying;
    public Lorry(String brand, String carClass, double weight, Engine motor, Driver driver, double carrying) {
        super(brand, carClass, weight, motor, driver);
        this.carrying = carrying;
    }
    public double getCarrying() {
        return carrying;
    }
    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }
}
