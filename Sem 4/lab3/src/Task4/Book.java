package Task4;
public class Book implements Printable {
    private String bookName;
    public Book(String bookName) {
        this.bookName = bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookName() {
        return bookName;
    }
    public void print() {
        System.out.println("Book name: " + bookName);
    }
    public static void printBooks(Printable[] arr) {
        for (Printable el : arr) {
            if(el instanceof Book) {
                el.print();
            }
        }
        System.out.println();
    }
}
