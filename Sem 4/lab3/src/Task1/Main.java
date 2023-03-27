package Task1;
public class Main {
    public static void runTask1() {
        Student x = new Magistracy();
        Student[] arr = new Student[4];
        arr[0] = new Student();
        arr[1] = new Magistracy();
        arr[2] = new Student("Epsilon", "Shd", "000005", 8);
        arr[3] = new Magistracy("Alpha", "Shd", "000001", 9, "ok");
        for (Student el : arr) {
            System.out.println(el.getScholarship());
        }
    }
}
