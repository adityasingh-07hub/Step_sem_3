public class BestTimeStock {

    // Method finds maximum profit possible
    static int maxProfit(int prices[]) {

        // Store minimum price seen so far
        int minimumPrice = prices[0];

        // Store maximum profit
        int maximumProfit = 0;

        // Traverse prices from left to right
        for(int i = 1; i < prices.length; i++) {

            // Calculate profit if sold today
            int currentProfit = prices[i] - minimumPrice;

            // Update maximum profit
            maximumProfit = Math.max(
                    maximumProfit,
                    currentProfit
            );

            // Update minimum buying price
            minimumPrice = Math.min(
                    minimumPrice,
                    prices[i]
            );
        }

        return maximumProfit;
    }

    public static void main(String[] args) {

        int prices[] = {7,1,5,3,6,4};

        System.out.println(
                "Maximum Profit = "
                + maxProfit(prices)
        );
    }
}