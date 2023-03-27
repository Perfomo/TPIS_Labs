package Task1;
public class Magistracy extends Student {
    private String scientificWorkName;
    public Magistracy() {
        super("FName", "LName", "000001", 0);
        this.scientificWorkName = "SomeWork";
    }
    public Magistracy(String firstName, String lastName, String group, double averageMark, String scientificWorkName) {
        super(firstName, lastName, group, averageMark);
        this.scientificWorkName = scientificWorkName;
    }
    public void setScientificWorkName(String scientificWorkName) {
        this.scientificWorkName = scientificWorkName;
    }
    public String getScientificWorkName() {
        return scientificWorkName;
    }
    public int getScholarship() {
        return (this.getAverageMark() >= 8) ? 200 : 180;
    }
}
