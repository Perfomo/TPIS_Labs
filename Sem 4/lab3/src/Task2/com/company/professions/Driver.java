package Task2.com.company.professions;
public class Driver extends Person {
    private double drivingYears;
    public Driver(String driverName, double drivingYears, double age) {
        super(driverName, age);
        this.drivingYears = drivingYears;
    }
    public double getDrivingYears() {
        return drivingYears;
    }
    public void setDrivingYears(double drivingYears) {
        this.drivingYears = drivingYears;
    }
}
