package subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII {
  public static void main(String[] args) {
    Solution s = new Solution();
    for(List<Integer> subset : s.subsetsWithDup(new int[]{1,2,2})) System.out.print(subset + " ");
    System.out.print("\n");
    for(List<Integer> subset : s.subsetsWithDup(new int[]{0})) System.out.print(subset + " ");
    System.out.print("\n");
  }
}

class Solution{
  public List<List<Integer>> subsetsWithDup(int[] nums){
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(0, subset, nums, result, false);
    return result;
  }

  private void backtrack(int i, List<Integer> subset, int[] nums, List<List<Integer>> result, boolean isPicked){
    if(i == nums.length){
      result.add(new ArrayList<>(subset));
      return;
    }
    if(i == 0 || nums[i] != nums[i-1] || isPicked){
      subset.add(nums[i]);
      backtrack(i+1, subset, nums, result, true);
      subset.remove(subset.size()-1);
    }
    backtrack(i+1, subset, nums, result, false);
  }
}