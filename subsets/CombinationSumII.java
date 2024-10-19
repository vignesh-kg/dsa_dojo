package subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
  public static void main(String[] args) {
    Solution s = new Solution();
    for(List<Integer> combination : s.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8))
      System.out.print(combination + " ");
    System.out.print("\n");
  }
}

class Solution{
  public List<List<Integer>> combinationSum2(int[] candidates, int target){
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    Arrays.sort(candidates);
    backtrack(0, 0, subset, target, candidates, result, false);
    return result;
  }

  private void backtrack(int i, int total, List<Integer> subset, int target, int[] candidates, List<List<Integer>> result, boolean isPicked){
    if(total == target){
      result.add(new ArrayList<>(subset));
      return;
    }
    if(i >= candidates.length || total > target) return;
    if(candidates[i] <= target && (i == 0 || candidates[i] != candidates[i-1] || isPicked)){
      subset.add(candidates[i]);
      backtrack(i+1, total+candidates[i], subset, target, candidates, result, true);
      subset.remove(subset.size()-1);
    }
    backtrack(i+1, total, subset, target, candidates, result, false);
  }
}