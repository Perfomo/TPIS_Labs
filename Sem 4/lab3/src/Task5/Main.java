package Task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean check(String login, String password, String confirm_password) {
//        String regex = "^[A-Za-z0-9_]{1,19}$";
        String regex = "\\w{1,19}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        try {
            matcher = pattern.matcher(login);
            if(!matcher.matches()) {
                throw new WrongLoginException();
            }
            else {
                matcher = pattern.matcher(password);
                try {
                    if(!matcher.matches() || !password.equals(confirm_password)) {
                        throw new WrongPasswordException();
                    }
                }
                catch (WrongPasswordException WPE) {
                    System.out.println(WPE.getMessage());
                    return false;
                }
            }
        }
        catch (WrongLoginException WLE) {
            System.out.println(WLE.getMessage());
            return false;
        }
        return true;
    }
    public static void runTask5() {
        System.out.println("Perfomo\t123qwe\t123qwe - " + check("Perfomo", "123qwe", "123qwe"));
        System.out.println("Perfomo|\t123qwe\t123qwe - " + check("Perfomo|", "123qwe", "123qwe"));
        System.out.println("Perfomo\t123qwe|\t123qwe - " + check("Perfomo", "123qwe|", "123qwe"));
        System.out.println("Perfomo\t123qwe|\t123qwe| - " + check("Perfomo", "123qwe|", "123qwe|"));
        System.out.println("Perfomoooooooooooooo\t123qwe\t123qwe - " + check("Perfomoooooooooooooo", "123qwe", "123qwe"));
        System.out.println("Perfomo\t123456789012345678900\t123456789012345678900 - " + check("Perfomo", "123456789012345678900", "123456789012345678900"));
        System.out.println("Perfomo\t*\t* - " + check("Perfomo", "*", "*"));
    }
}
