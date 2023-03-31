package Task5;
public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Bad password...");
    }
    public WrongPasswordException(String str) {
        super(str);
    }
}
