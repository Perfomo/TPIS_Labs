public class StrAlg {
    public static String Str2ToSub(String[] arr, int i, int j) {
        String res = "";
        for(int k = i; k < j+1; k++) {
            res += arr[k];
        }
        return res;
    }
    public static String[] delUpper(String[] arr, int i) {
        String s = "";
        for(int j = 0; j < arr[i].length(); j++) {
            if((int)arr[i].charAt(j) < 41 | (int)arr[i].charAt(j) > 90) {
                s += arr[i].charAt(j);
            }
        }
        arr[i] = s;
        System.out.println("New arr[i] string: " + arr[i]);
        return arr;
    }
    public static String[] delBetChars(String[] arr, int i, char ch1, char ch2) {
        String s = "";
        String buf = "";
        boolean add = true;
        for(int j = 0; j < arr[i].length(); j++) {
            if(arr[i].charAt(j) == ch1) {
                s += arr[i].charAt(j);
                j += 1;
                while (j < arr[i].length())
                {
                    if(arr[i].charAt(j) == ch2) {
                        add = false;
                        s += arr[i].charAt(j);
                        break;
                    }
                    else {
                        buf += arr[i].charAt(j);
                    }
                    j += 1;
                }
                if(add) {
                    s += buf;
                }
                buf = "";
            }
            else {
                s += arr[i].charAt(j);
            }
        }
        arr[i] = s;
        System.out.println("New string: " + s);
        return arr;
    }
}
