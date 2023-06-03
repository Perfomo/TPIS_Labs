package BSUIR.ICT.TPIS.Lab4.Task1;

import java.util.LinkedList;

public class Student implements Comparable<Student> {
    private String name;
    private int course;
    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public String getName() {
        return name;
    }
    public int getCourse() {
        return course;
    }
    public int compareTo(Student person) {
        int res = this.getCourse() - person.getCourse();
        if(res == 0) {
            if(this.getName().equals(person.getName())) {
                return 0;
            }
            return 1;
        }
        return res;
    }
    public static void ptintStudents(LinkedList<Student> students, int course) {
        System.out.println("Students at " + course + " course: ");
        for (Student person : students) {
            if(person.getCourse() == course) {
                System.out.println(person.getName());
            }
        }
    }
    public static void printAllStudents(LinkedList<Student> students) {
        System.out.println("Printing all students: ");
        for (Student person : students) {
            System.out.println(person.getName() + " " + person.getCourse());
        }
    }

    public static LinkedList<Student> union(LinkedList<Student> list1, LinkedList<Student> list2) {
        for(Student person : list2) {
            list1.add(person);
        }
        //list1.addAll(list2);
        return list1;
    }

    public static LinkedList<Student> intersect(LinkedList<Student> list1, LinkedList<Student> list2) {
        LinkedList<Student> list3 = new LinkedList<>();

        if(list1.isEmpty() | list2.isEmpty()) {
            return list3;
        }

        for(Student person1 : list1) {
            for(Student person2 : list2) {
                if (person1.equals(person2)) {
                    list3.add(person2);
                }
            }
        }
        return list3;
    }
}
