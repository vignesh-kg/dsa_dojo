package AgodaInterviewPrep;

public class JumpGame {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.canJump(new int[] {2,3,1,1,4}));
    System.out.println(s.canJump(new int[] {2,2,1,1,0}));
  }
}

class Solution{
  public boolean canJump(int[] nums) {
    int maxJump = 0;
    for(int i = 0; i < nums.length; ++i){
      if(i > maxJump) return false;
      int curJump = i + nums[i];
      if(curJump > maxJump) maxJump = curJump;
      if(maxJump >= nums.length) return true;
    }
    return false;
  }
}