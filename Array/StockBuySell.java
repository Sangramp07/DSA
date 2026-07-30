public class StockBuySell {
    public static void main(String[] args) {
        int[] nums={1,7,5,6,3};
        System.out.println(MaxProfit(nums));
    }
    static int maxProfit(int[] prices) {
        int mini=prices[0];
        int MaxProfit=0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return MaxProfit;
}
