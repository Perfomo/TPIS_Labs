package BSUIR.ICT.TPIS.Lab4.Task3;

public class Main {
    public static void runTask3() {
        String f1 = "f1.txt";
        System.out.println(CopyPaster.copyPaste(f1,""));
        String f2 = "f2.txt";
        System.out.println(CopyPaster.copyPaste(f1,f2));
        System.out.println(CopyPaster.copyPaste("",""));
    }
}
