package AgodaInterviewPrep;

import java.util.Arrays;

public class MoveZeros {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] nums = new int[]{0,1,0,3,12};
    s.moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
    nums = new int[]{1, 12};
    s.moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
  }
}

class Solution {
  public void moveZeroes(int[] nums) {
    int nonZeroIndex = 0;
    for(int i = 0; i < nums.length; ++i ){
      if(nums[i] != 0){
        int temp = nums[i];
        nums[i] = nums[nonZeroIndex];
        nums[nonZeroIndex] = temp;
        ++nonZeroIndex;
      }
    }
  }
}