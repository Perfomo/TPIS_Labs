package BSUIR.ICT.TPIS.Lab4.Task4;

public class Main {
    public static void runTask4() {
        Horse horse = new Horse(100);
        System.out.println("Horse speed: " + horse.getSpeed());
        SerializeHorse.serialize(horse);
        Horse newHorse = SerializeHorse.deserialize();
        System.out.println("New Horse speed: " + newHorse.getSpeed());
        System.out.println("Equal horses? - " + horse.equals(newHorse));
    }
}
