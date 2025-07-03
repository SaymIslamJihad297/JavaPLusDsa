public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices){
        int buyPrice = prices[0];
        int sellPrice = 0;
        int maxProfit = 0;

        int i = 0;
        while (i < prices.length-1) {
            sellPrice = prices[i+1];
            int profit = sellPrice - buyPrice;

            if(profit < 0){
                buyPrice = sellPrice;
            }else{
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
            i++;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
