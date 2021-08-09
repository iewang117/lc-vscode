/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int pre = 0, maxAns = nums[0];
        for(int i = 0; i < n; i++){
            pre = Math.max(nums[i], pre + nums[i]);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
// @lc code=end

