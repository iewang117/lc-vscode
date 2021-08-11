/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i = 0; i < n; i++){
            dp[i][i] = true;
        }

        int begin = 0;
        int maxLen = 1;
        char[] charArray = s.toCharArray();
        for(int len = 2; len <= n; len++){
            for(int i = 0; i < n; i++){
                int j = i + len - 1;
                if(j >= n){
                    break;
                }

                if(charArray[i]!=charArray[j]){
                    dp[i][j] = false;
                }else if(j - i < 3){
                    dp[i][j] = true;
                }else{
                    dp[i][j] = dp[i+1][j-1];
                }

                if(dp[i][j] && j - i + 1 > maxLen){
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
// @lc code=end

