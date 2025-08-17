public class stockMaxProfit {

    public static int maxProfitStock(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i= 0; i<prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (maxProfit < profit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfitStock(prices));
    }
}
