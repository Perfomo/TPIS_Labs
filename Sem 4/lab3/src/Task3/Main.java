package Task3;
public class Main {
    public static void runTask3() {
        double plumCost = 0, appleCost = 0, pearCost = 0;
        Fruit[] arr = new Fruit[6];
        arr[0] = new Apple(2);
        arr[1] = new Apple(2.8);
        arr[2] = new Pear(5);
        arr[3] = new Pear(1.8);
        arr[4] = new Plum(10);
        arr[5] = new Plum(7.2);
        for (int i = 0; i < 2; i++) {
            appleCost += arr[i].getCost();
            pearCost += arr[i+2].getCost();
            plumCost += arr[i+4].getCost();
        }
        System.out.println("\nPlum cost: " + plumCost + "\nPear cost: " + pearCost + "\nApple cost: " + appleCost + "\nTotal cost: " + (appleCost+plumCost+pearCost));
    }
}
