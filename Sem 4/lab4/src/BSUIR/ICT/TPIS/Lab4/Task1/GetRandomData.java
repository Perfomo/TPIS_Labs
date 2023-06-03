package BSUIR.ICT.TPIS.Lab4.Task1;
public class GetRandomData {
    private static final String[] names = {"Kola", "Petya", "Max", "Fedor", "Sasha", "Vova", "Dima", "Nastya", "Margo", "Sofia"};
    public static String getName() {
        return names[(int) (Math.random() * 10)];
    }
    public static int getCourse() {
        return ((int) (Math.random() * 5));
    }
}
