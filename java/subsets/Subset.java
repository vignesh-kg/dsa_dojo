package subsets;

import java.util.ArrayList;
import java.util.List;

public class Subset {
  public static void main(String[] args) {
    Solution s = new Solution();
    for(List<Integer> subset : s.subsets(new int[]{1,2,3,4})) System.out.print(subset + " ");
    System.out.print("\n");
    for(List<Integer> subset : s.subsets(new int[]{0})) System.out.print(subset + " ");
    System.out.print("\n");
  }
}

class Solution{
  //TC: O(2 ^ n)
  //SC: O(2 ^ n)
  public List<List<Integer>> subsets(int[] nums){
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    buildSubsets(0, subset, nums, result);
    return result;
  }

  private void buildSubsets(int i, List<Integer> subset, int[] nums, List<List<Integer>> result){
    if(i == nums.length) {
      result.add(new ArrayList<>(subset));
      return;
    }
    subset.add(nums[i]);
    buildSubsets(i+1, subset, nums, result);
    subset.remove(subset.size()-1);
    buildSubsets(i+1, subset, nums, result);
  }
}