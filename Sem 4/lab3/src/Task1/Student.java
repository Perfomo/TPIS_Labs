package Task1;
public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;
    public Student() {
        this.firstName = "FirName1";
        this.lastName = "LastName";
        this.group = "000000";
        this.averageMark = 0;
    }
    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    public double getAverageMark() {
        return averageMark;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getGroup() {
        return group;
    }
    public String getLastName() {
        return lastName;
    }
    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getScholarship() {
        return (this.averageMark >= 8) ? 100 : 80;
    }
}
