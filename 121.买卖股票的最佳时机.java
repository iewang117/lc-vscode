/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] lowest = new int[n];
        lowest[0] = prices[0];
        for (int i = 1; i < n; i++) {
            lowest[i] = Math.min(lowest[i - 1], prices[i]);
        }
        int ans = 0;
        for (int i = 1; i < n; i++) {
            ans = Math.max(ans, prices[i] - lowest[i]);
        }
        return ans;
    }
}
// @lc code=end
