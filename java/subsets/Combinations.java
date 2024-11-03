package subsets;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
  public static void main(String[] args){
    Solution s = new Solution();
    for(List<Integer> combination : s.combine(4, 2)){
      System.out.print(combination + ", ");
    }
    System.out.print("\n");
    for(List<Integer> combination : s.combine(1, 1)){
      System.out.print(combination + ", ");
    }
    System.out.print("\n");
  }
}

class Solution {
  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    backtrack(1, subset, result, n, k);
    return result;
  }

  private void backtrack(int index, List<Integer> subset, List<List<Integer>> result, int n, int k){
    if(subset.size() == k) {
      result.add(new ArrayList<>(subset));
      return;
    }
    for(int i = index; i <= n; ++i){
      subset.add(i);
      backtrack(i+1, subset, result, n, k);
      subset.remove(subset.size()-1);
    }
  }
}