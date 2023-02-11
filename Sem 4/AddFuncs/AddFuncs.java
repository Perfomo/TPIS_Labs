public class TestConsole
{
    public static void main(String[] args)
    {
        System.out.print("Enter a character: ");
        // Read the char
        char ch = (char) System.in.read();

        System.out.print("\n You pressed: " + ch);
    }
}