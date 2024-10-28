package AgodaInterviewPrep;

public class HouseRobber {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println("max Rob : " + s.rob(new int[]{1,2,3,1}));
    System.out.println("max Rob : " + s.rob(new int[]{1,3,5,4}));
  }
}

class Solution {
  public int rob(int[] nums) {
    int rob1 = 0, rob2 = 0;
    for(int num : nums){
      int curRob = Math.max(rob1+num, rob2);
      rob1 = rob2;
      rob2 = curRob;
    }
    return rob2;
  }
}