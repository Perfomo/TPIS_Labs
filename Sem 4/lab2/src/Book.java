import java.util.Scanner;
public class Book {
    public String author;
    public String name;
    public int year;
    public int amount;
    public Book() {
        author = "|||||";
        name = "Magic";
        year = 2000;
        amount = -3;
    }
    public Book(String author, String name, int year, int amount) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.amount = amount;
    }
    public void change_author(String author) {
        this.author = author;
        System.out.println("New author: " + author);
    }
    public void change_author() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input new author: ");
        String author = sc.next();
        this.author = author;
        System.out.println("New author: " + author);
    }
    public void change_name(String name) {
        this.name = name;
        System.out.println("New name: " + name);
    }
    public void change_name() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input new name: ");
        String name = sc.next();
        this.name = name;
        System.out.println("New name: " + name);
    }
    public void change_year(int year) {
        this.year = year;
        System.out.println("New year: " + year);
    }
    public void change_year() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input new year: ");
        if(sc.hasNextInt()) {
            int year = sc.nextInt();
            this.year = year;
            System.out.println("New year: " + year);
        }
        else {
            sc.next();
            System.out.println("Not a number...");
        }
    }
    public void change_amount(int amount) {
        this.amount = amount;
        System.out.println("New amount: " + amount);
    }
    public void change_amount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input new amount: ");
        if(sc.hasNextInt()) {
            int amount = sc.nextInt();
            this.amount = amount;
            System.out.println("New amount: " + amount);
        }
        else {
            sc.next();
            System.out.println("Not a number...");
        }
    }
    public void get_info(String name) {
        if(this.name.equals(name)){
            System.out.println("Name: " + name + "\nAuthor: " + author + "\nYear: " + year + "\nAmount: " + amount);
        }
        else {
            System.out.println("Name is not equals to obj name...");
        }
    }
}
