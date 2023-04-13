package Task1;

public class TwoNumArrays<T extends Number, V extends Number> {
    private T[] arr_1;
    private V[] arr_2;
    public TwoNumArrays(T[] arr_1, V[] arr_2) {
        this.arr_1 = arr_1;
        this.arr_2 = arr_2;
    }
    public double twoNumSum(int num_1_pos, int num_2_pos) {
        return arr_1[num_1_pos].doubleValue() + arr_2[num_2_pos].doubleValue();
    }
    public boolean isEqual() {
        if(arr_1.length != arr_2.length) {
            return false;
        }
        for(int i = 0; i < arr_1.length; i++) {
            if(arr_1[i].doubleValue() != arr_2[i].doubleValue()) {
                return false;
            }
        }
        return true;
    }
    public void twoArraysFindMaxMin() {
        double arr_1Max = arr_1[0].doubleValue(), arr_1Min= arr_1[0].doubleValue(), arr_2Max = arr_2[0].doubleValue(), arr_2Min = arr_2[0].doubleValue();
        if(arr_1.length == arr_2.length) {
            for(int i = 1; i < arr_1.length; i++) {
                double arr_1_now = arr_1[i].doubleValue(), arr_2_now = arr_2[i].doubleValue();
                if(arr_1_now > arr_1Max) {
                    arr_1Max = arr_1_now;
                }
                if(arr_1_now < arr_1Min) {
                    arr_1Min = arr_1_now;
                }
                if(arr_2_now > arr_2Max) {
                    arr_2Max = arr_2_now;
                }
                if(arr_2_now < arr_2Min) {
                    arr_2Min = arr_2_now;
                }
            }
        }
        else {
            double arr_1_now, arr_2_now;
            for (int i = 1; i < arr_1.length; i++) {
                arr_1_now = arr_1[i].doubleValue();
                if(arr_1_now > arr_1Max) {
                    arr_1Max = arr_1_now;
                }
                if(arr_1_now < arr_1Min) {
                    arr_1Min = arr_1_now;
                }
            }
            for (int i = 1; i < arr_2.length; i++) {
                arr_2_now = arr_2[i].doubleValue();
                if(arr_2_now > arr_2Max) {
                    arr_2Max = arr_2_now;
                }
                if(arr_2_now < arr_2Min) {
                    arr_2Min = arr_2_now;
                }
            }
        }
        System.out.println("Arr1 max: " + arr_1Max + "\nArr1 min: " + arr_1Min);
        System.out.println("Arr2 max: " + arr_2Max + "\nArr2 min: " + arr_2Min);
    }
}
