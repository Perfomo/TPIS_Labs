package BSUIR.ICT.TPIS.Lab4.Task4;

import java.io.*;

public class SerializeHorse {
    private static final String FILE_NAME = "SerHorse.ser";
    public static Horse deserialize() {
        Horse horse = null;
        try(FileInputStream fis = new FileInputStream(FILE_NAME);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            horse = (Horse) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return horse;
    }
    public static void serialize(Horse horse) {
        try (FileOutputStream fs = new FileOutputStream(FILE_NAME);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(horse);
        } catch (IOException E) {
            System.out.println(E.getMessage());
        }
    }
}
