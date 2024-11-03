package dp;

public class MinCostClimbingStairs {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.minCostClimbingStairs(new int[]{10,15,20}));
    System.out.println(s.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
  }
}

class Solution {
  public int minCostClimbingStairs(int[] cost) {
    if(cost.length < 2) return 0;
      int step1 = cost[0], step2 = cost[1];
      int curCost;
      for(int i = 2; i < cost.length; ++i){
        curCost = cost[i] + Math.min(step1, step2);
        step1 = step2;
        step2 = curCost;
      }
    return Math.min(step1, step2);
  }
}