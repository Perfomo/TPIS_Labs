package Task2.com.company;

import Task2.com.company.details.Engine;
import Task2.com.company.professions.Driver;
import Task2.com.company.vehicles.Car;
import Task2.com.company.vehicles.Lorry;
import Task2.com.company.vehicles.SportCar;

public class Main {
    public static void runTask2() {
        Engine en = new Engine(200, "BMW");
        Driver dr = new Driver("Max", 5, 25);
        Car c1 = new Car("BMW", "s+++", 3, en, dr);
        Lorry c2 = new Lorry("BMW", "S++", 6, en, dr, 10);
        SportCar c3 = new SportCar("BMW", "S++++++++", 2, en, dr, 500);
        c1.toString();
        c2.toString();
        c3.toString();
        c3.start();
        c3.turnLeft();
        c3.turnRight();
        c3.stop();
    }
}
