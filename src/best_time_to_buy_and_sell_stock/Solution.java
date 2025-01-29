package best_time_to_buy_and_sell_stock;

/**
 *
 * @author firman
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            int buy = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int sell = prices[j];
                ans = Math.max(ans, sell - buy);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] prices = {10,1,5,6,7,1};
        Solution solution = new Solution();
        int ans = solution.maxProfit(prices);
        System.out.println(ans);
    }
}
