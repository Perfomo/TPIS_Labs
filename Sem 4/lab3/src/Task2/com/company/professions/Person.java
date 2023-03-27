package Task2.com.company.professions;
public class Person {
    private String driverName;
    private double age;
    public Person(String driverName, double age) {
        this.driverName = driverName;
        this.age = age;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }
    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
}
