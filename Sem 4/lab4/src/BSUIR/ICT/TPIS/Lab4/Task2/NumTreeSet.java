package BSUIR.ICT.TPIS.Lab4.Task2;
import java.util.HashMap;
import java.util.TreeSet;

public class NumTreeSet extends TreeSet<Double> {
    private HashMap<Double, Integer> map;
    public NumTreeSet() {
        super();
        this.map = new HashMap<Double, Integer>();
    }
    public HashMap<Double, Integer> getMap() {
        return map;
    }
    public void addNum(double num) {
        if(map.containsKey(num)) {
            map.replace(num, map.get(num) + 1);
        }
        else {
            map.put(num, 1);
            this.add(num);
        }
    }

    public void removeNum(double num) {
        if(map.containsKey(num)) {
            int am = map.get(num);
            if(am > 1) {
                map.replace(num, map.get(num) - 1);
            }
            else {
                map.remove(num);
                this.remove(num);
            }
        }
        else {
            System.out.println("/nNot found...");
        }
    }

    public double findNum(double num) {
        if(map.containsKey(num)) {
            System.out.println("\nSuccessfully found " + map.get(num) + " items " + "'" + num + "'");
            return num;
        }
        double min = 0, max = 0;
        boolean maxExp = false, minExp = false;

        try{
            max = this.higher(num);
        }
        catch (NullPointerException NPE) {
            maxExp = true;
        }

        try{
            min = this.lower(num);
        }
        catch (NullPointerException NPE) {
            minExp = true;
        }
        if(!minExp & !maxExp) {
            return (Math.abs(num - min) <= Math.abs(num-max)) ? min : max;
        }
        if(!minExp) {
            return min;
        }
        if (!maxExp) {
            return max;
        }
        System.out.println("Error");
        return 0;
    }
}
