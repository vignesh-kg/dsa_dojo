import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
  public static void main(String[] args){
    Solution s = new Solution();
    for(List<Integer> subList : s.threeSum(new int[]{-1,0,1,2,0,-1,-4,0})){
      System.out.print(subList + ", ");
    }
    System.out.print("\n");
  }
}

class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> result = new HashSet<>();
    Arrays.sort(nums);
    for(int i = 0; i < nums.length; ++i){
      if(i != 0 && nums[i] == nums[i-1] ) continue;
      int left = i+1, right = nums.length-1;
      int curSum;
      while(left < right){
        curSum = 0;
        curSum += nums[i];
        curSum += nums[left];
        curSum += nums[right];
        if(curSum == 0){
          result.add(Arrays.asList(nums[i], nums[left], nums[right]));
          ++left; --right;
          while(left < right && nums[left] == nums[left-1]) ++left;
          while(left < right && nums[right] == nums[right+1]) --right;
        } else if(curSum < 0) ++left;
        else --right;
      }
    }
    return new ArrayList<>(result);
  }
}