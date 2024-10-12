public class IncreasingTripletSequence {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.increasingTripletSequence(new int[]{1,2,3,4,5}));
    System.err.println(s.increasingTripletSequence(new int[]{5,4,3,2,1}));
  }
}

class Solution{
  public boolean increasingTripletSequence(int[] nums){
    int i = Integer.MAX_VALUE;
    int j = Integer.MAX_VALUE;

    for(int count = 0; count < nums.length; ++count){
      if(nums[count] <= i) i = nums[count];
      else if(nums[count] <= j) j = nums[count];
      else return true;
    }
    return false;
  }
}