package AgodaInterviewPrep;

public class JumpGame2 {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.jump(new int[]{1,0}));
    System.out.println(s.jump(new int[]{1,1,1}));
    System.out.println(s.jump(new int[]{4,0,1,3,1,6}));
  }
}

class Solution{
  public int jump(int[] nums){
    int jumpsRequired = 0;
    int left = 0, right = 0;
    while(right < nums.length-1){
      int maxJumpPossible = 0;
      for(int i = left; i <= right; ++i){
        int curJumpPossible = i + nums[i];
        if(curJumpPossible > maxJumpPossible) maxJumpPossible = curJumpPossible;
      }
      left = right+1;
      right = maxJumpPossible;
      ++jumpsRequired;
    }
    return jumpsRequired;
  }
}