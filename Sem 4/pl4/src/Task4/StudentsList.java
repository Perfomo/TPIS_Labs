package Task4;
import java.util.LinkedList;

public class StudentsList<T extends Student> extends LinkedList<T>{
    public StudentsList() {
        super();
    }
    public void printAllStudent() {
        for (T t : this) {
            System.out.println("\nName: " + t.getName() + "\nGroup: " + t.getGroup() + "\nCourse: " + t.getGroup());
        }
    }
    public void printStudents(LinkedList<Student> students, int course) {
        for(Student el: students) {
            if(el.getCourse() == course) {
                System.out.println("\nName: " + el.getName());
            }
        }
    }
    public void clearStudents() {
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getAveMark() < 3) {
                this.remove(i);
                i--;
            }
            else {
                this.get(i).setCourse(this.get(i).getCourse() + 1);
            }
        }
    }
}
