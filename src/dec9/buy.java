package dec9;

public class buy {
    static void main() {
        int[]prices={7,1,5,3,6,4};
        int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        System.out.println(profit);

    }
}
