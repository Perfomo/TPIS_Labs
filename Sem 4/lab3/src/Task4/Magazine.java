package Task4;
public class Magazine implements Printable {
    private String magazineName;
    public Magazine(String magazineName) {
        this.magazineName = magazineName;
    }
    public String getMagazineName() {
        return magazineName;
    }
    public void setMagazineName(String magazineName) {
        this.magazineName = magazineName;
    }
    public void print() {
        System.out.println("Magazine name: " + magazineName);
    }
    public static void printMagazines(Printable[] arr) {
        for (Printable el : arr) {
            if(el instanceof Magazine) {
                el.print();
            }
        }
        System.out.println();
    }
}