package Task2.com.company.vehicles;
import Task2.com.company.details.Engine;
import Task2.com.company.professions.Driver;

public class SportCar extends Car {
    private double maxSpeed;
    public SportCar(String brand, String carClass, double weight, Engine motor, Driver driver, double maxSpeed) {
        super(brand, carClass, weight, motor, driver);
        this.maxSpeed = maxSpeed;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
