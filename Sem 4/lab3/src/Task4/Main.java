package Task4;
public class Main {
    public static void runTask4() {
        Printable[] arr = new Printable[4];
        arr[0] = new Book("Book1");
        arr[1] = new Magazine("Magazine1");
        arr[2] = new Magazine("Magazine2");
        arr[3] = new Book("Book2");
        for (Printable el : arr) {
            el.print();
        }
        System.out.println();
        Book.printBooks(arr);
        Magazine.printMagazines(arr);
    }
}
