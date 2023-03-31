package Task5;
public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Bad login...");
    }
    public WrongLoginException(String str) {
        super(str);
    }
}
