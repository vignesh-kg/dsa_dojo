package subsets;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
  public static void main(String[] args){
    Solution s = new Solution();
    for(List<Integer> combination : s.combinationSum(new int[]{2,3,6,7}, 7)) System.out.print(combination + " ");
    System.out.print("\n");
  }
}

class Solution{
  public List<List<Integer>> combinationSum(int[] candidates, int target){
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    backtrack(0, 0, subset, candidates, target, result);
    return result;
  }

  private void backtrack(int i, int total, List<Integer> subset, int[] candidates, int target, List<List<Integer>> result){
    if(total == target){
      result.add(new ArrayList<>(subset));
      return;
    }
    if(total > target || i >= candidates.length) return;
    if(candidates[i] <= target){
      subset.add(candidates[i]);
      backtrack(i, total+candidates[i], subset, candidates, target, result);
      subset.remove(subset.size()-1);
    }
    backtrack(i+1, total, subset, candidates, target, result);
  }


}
