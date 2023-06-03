package BSUIR.ICT.TPIS.Lab4.Task1;

import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;
public class Main {
    public static void runTask1() {
        LinkedList<Student> list1 = new LinkedList<>();
        for(int i = 0; i < 10; i++) {
            list1.add(new Student(GetRandomData.getName(), GetRandomData.getCourse()));
        }
        System.out.println("\nList 1 data: ");
        Student.printAllStudents(list1);
        System.out.println("\nChecking method ptintStudents with 'List 1' and course 2: ");
        Student.ptintStudents(list1, 2);
        System.out.println("--------------------");

        LinkedList<Student> list2 = new LinkedList<>();
        LinkedList<Student> list3 = new LinkedList<>();

        for(int i = 0; i < 5; i++) {
            list2.add(new Student(GetRandomData.getName(), GetRandomData.getCourse()));
            list3.add(new Student(GetRandomData.getName(), GetRandomData.getCourse()));
        }

        System.out.println("\nList 2 data: ");
        Student.printAllStudents(list2);

        System.out.println("\nList 3 data: ");
        Student.printAllStudents(list3);

        list1 = Student.intersect(list2, list3);
        System.out.println("\nChecking methods intersect with list2 and list3");
        Student.printAllStudents(list1);

        list1 = Student.union(list2, list3);
        System.out.println("\nChecking methods union with list2 and list3");
        Student.printAllStudents(list1);

        System.out.println("--------------------");
        SortedSet<Student> set = new TreeSet<>();
        System.out.println("\nset data: ");
        for(int i = 0; i < 6; i++) {
            Student person = new Student(GetRandomData.getName(), GetRandomData.getCourse());
            System.out.println(person.getName() + " " + person.getCourse());
            set.add(person);
        }
        System.out.println("\nChecking Comparable with set: ");
        for (Student person: set) {
            System.out.println(person.getName() + " " + person.getCourse());
        }
    }
}
