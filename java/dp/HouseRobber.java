package dp;

public class HouseRobber {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.rob(new int[]{10, 15, 20}));
    System.out.println(s.rob(new int[]{10,15,20,20}));
    System.out.println(s.rob(new int[]{2,1}));
  }
}

class Solution {
  public int rob(int[] nums) {
    int n = nums.length;
    int rob1 = 0, rob2 = 0;
    int curRob;
    for(int i = 0; i < n; ++i){
      curRob = Math.max(nums[i]+rob1, rob2);
      rob1 = rob2;
      rob2 = curRob;
    }
    return rob2;
  }
}