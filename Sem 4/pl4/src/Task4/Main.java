package Task4;
public class Main {
    public static void runTask4() {
        StudentsList<Student> list = new StudentsList<>();
        int[] a1 = {1,2,1};
        int[] a2 = {9,6,8,7};
        list.add(new Student("Sasha", "111", 3, a1));
        list.add(new Student("Dima", "111", 1, a2));
        list.add(new Student("SDFSADF", "1SDF11", 10, a2));
        list.add(new Student("Who", "222", 3, a2));
        list.add(new Student("Whi", "222", 1, a1));
        list.add(new Student("Wher", "222", 1, a1));
        list.printAllStudent();
        list.remove(2);
        list.printAllStudent();
        list.printStudents(list,1);
        list.clearStudents();
        list.printAllStudent();
    }
}
