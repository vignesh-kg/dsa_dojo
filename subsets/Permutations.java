package subsets;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
  public static void main(String[] args) {
    Solution s = new Solution();
    for(List<Integer> permutation : s.permute(new int[]{1,2,3})){
      System.out.print(permutation + ", ");
    }
    System.out.print("\n");
  }
}

class Solution {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(result, new boolean[nums.length], new ArrayList<>(), nums);
    return result;
  }

  private void backtrack(List<List<Integer>> result, boolean[] used, List<Integer> subset, int[] nums){
    if(subset.size() == nums.length){
      result.add(new ArrayList<>(subset));
      return;
    }
    for(int i = 0; i < nums.length; ++i){
      if(used[i]) continue;
      subset.add(nums[i]);
      used[i] = true;
      backtrack(result, used, subset, nums);
      subset.remove(subset.size()-1);
      used[i] = false;
    }
  }
}