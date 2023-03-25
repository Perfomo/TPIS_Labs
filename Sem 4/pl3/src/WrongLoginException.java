public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("WrongLoginException");
    }
    public WrongLoginException(String str) {
        super(str);
    }
}
