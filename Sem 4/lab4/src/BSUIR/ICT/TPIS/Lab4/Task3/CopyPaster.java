package BSUIR.ICT.TPIS.Lab4.Task3;
import java.io.*;

public class CopyPaster {
    static boolean copyPaste(String f1_path, String f2_path) {
        BufferedWriter bw;
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(f1_path));
            bw = new BufferedWriter(new FileWriter(f2_path));
            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
                System.out.println(str);
            }
            br.close();
            bw.close();
        }
        catch (IOException IOE) {
            System.out.println(IOE.getMessage());
            return false;
        }
        return true;
    }
}
