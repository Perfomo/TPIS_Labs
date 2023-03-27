package Task2.com.company.vehicles;

import Task2.com.company.details.Engine;
import Task2.com.company.professions.Driver;

public class Car {
    private String brand;
    private String carClass;
    private double weight;
    private Engine motor;
    private Driver driver;
    public Car(String brand, String carClass, double weight, Engine motor, Driver driver) {
        this.driver = driver;
        this.brand = brand;
        this.carClass = carClass;
        this.weight = weight;
        this.motor = motor;
    }
    public String getBrand() {
        return brand;
    }
    public String getCarClass() {
        return carClass;
    }
    public double getWeight() {
        return weight;
    }
    public Driver getDriver() {
        return driver;
    }
    public Engine getMotor() {
        return motor;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public void setMotor(Engine motor) {
        this.motor = motor;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void start() {
        System.out.println("Start!");
    }
    public void stop() {
        System.out.println("Stop");
    }
    public void turnRight() {
        System.out.println("Turn Right");
    }
    public void turnLeft() {
        System.out.println("Turn Left");
    }
    public String toString() {
        String str = "\nBrand: " + brand + "\nClass: " + carClass + "\nWeight: " + weight + "\nMotor: " + motor + "\nDriver: " + driver;
        System.out.println(str);
        return str;
    }
}