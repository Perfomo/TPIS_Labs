package BSUIR.ICT.TPIS.Lab4.Task4;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    private double speed;
    public Horse() {
        super();
        this.speed = 2;
    }
    public Horse(double speed) {
        super();
        this.speed = speed;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
