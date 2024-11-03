package dp;

public class LongestCommonSubsequence {
  public static void main(String[] args){
    Solution s = new Solution();
    System.out.println(s.longestCommonSubsequence("abcde", "bce"));
  }
}

class Solution {
  public int longestCommonSubsequence(String text1, String text2) {
    char[] txt1Arr = text1.toCharArray();
    char[] txt2Arr = text2.toCharArray();
    int[][] dp = new int[txt1Arr.length+1][txt2Arr.length+1];
    for(int i = 1; i <= txt1Arr.length; ++i){
      for(int j = 1; j <= txt2Arr.length; ++j){
        if(txt1Arr[i-1] == txt2Arr[j-1]){
          dp[i][j] = 1 + dp[i-1][j-1];
        } else {
          dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
        }
      }
    }
    return dp[txt1Arr.length][txt2Arr.length];
  }
}