public class Student_1 {
    public int numberCourse;
    public String nameStudent;
    public void show() {
        System.out.println("\nStudent info:\nName: " + nameStudent + "\nCourse: " + numberCourse);
    }
    public double ave_mark_test() {
        int[] arr = {1, 2, 3, 4, 5};
        double res = 0;
        for(int i = 0; i < 5; i++) {
            res += arr[i];
        }
        return res / 5;
    }
    public double ave_mark(int[] arr) {
        double res = 0;
        for(int i = 0; i < 5; i++) {
            res += arr[i];
        }
        return res / 5;
    }
    public Student_1() {
        numberCourse = 1;
        nameStudent = "/---/";
    }
    public Student_1(int course, String name) {
        numberCourse = course;
        nameStudent = name;
    }
    public Student_1(int numberCourse, String nameStudent, boolean ok) {
        this.numberCourse = numberCourse;
        this.nameStudent = nameStudent;
    }
    public Student_1(Student_1 obj) {
        this.numberCourse = obj.numberCourse;
        this.nameStudent = obj.nameStudent;
    }
}
