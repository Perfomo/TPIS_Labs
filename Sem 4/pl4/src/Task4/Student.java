package Task4;
public class Student {
    private String name;
    private String group;
    private int course;
    private int[] marks;
    public Student(String name, String group, int course, int[] marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }
    public String getGroup() {
        return group;
    }
    public int getCourse() {
        return course;
    }
    public String getName() {
        return name;
    }
    public int[] getMarks() {
        return marks;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAveMark() {
        double res = 0;
        int amount = 0;
        for(int i : this.marks) {
            res += i;
            amount++;
        }
        return res / amount;
    }
}
