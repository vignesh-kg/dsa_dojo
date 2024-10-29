package AgodaInterviewPrep;

import java.util.Arrays;
import java.util.List;

public class Triangle {
  public static void main(String[] args){
    Solution s = new Solution();
    List<List<Integer>> triangle = Arrays.asList(Arrays.asList(2), Arrays.asList(3,4), Arrays.asList(6,5,7), Arrays.asList(4,1,8,3));
    System.out.println(s.minimumTotal(triangle));
  }
}

class Solution {
  public int minimumTotal(List<List<Integer>> triangle) {
    int triangleLen = triangle.size();
    int[] dp = new int[triangle.get(triangleLen-1).size()+1];
    for(int j = triangleLen-1; j >= 0; --j){
      List<Integer> row = triangle.get(j);
      for(int i = 0; i < row.size(); ++i){
        dp[i] = row.get(i) + Math.min(dp[i], dp[i+1]);
      }
    }
    return dp[0];
  }
}