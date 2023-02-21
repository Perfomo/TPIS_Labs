public class StrAlg {
    public static String Str2ToSub(String[] arr, int i, int j) {
        String res = "";
        for(int k = i; k < j+1; k++) {
            res += arr[k];
        }
        return res;
    }
}
