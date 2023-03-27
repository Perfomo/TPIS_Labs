package Task2.com.company.details;
public class Engine {
    private double power;
    private String producer;
    public Engine(double power, String producer) {
        this.power = power;
        this.producer = producer;
    }
    public double getPower() {
        return power;
    }
    public String getProducer() {
        return producer;
    }
    public void setPower(double power) {
        this.power = power;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
}
