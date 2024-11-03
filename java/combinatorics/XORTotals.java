public class XORTotals {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.subsetXORSum(new int[]{1,3}));
    System.out.println(s.subsetXORSum(new int[]{5,1,6}));

    System.out.println(s.XORSum(new int[]{1,3}));
    System.out.println(s.XORSum(new int[]{5,1,6}));
  }
}

class Solution{
  /*
   * Approach 1:
   * Using DFS to build 2 pow (n) subsets, XOR elements in Subset 
   * and add to total System.out.println(s.subsetXORSum(new int[]{1,3}));
   */
  public int subsetXORSum(int[] nums){
    return dfs(0, 0, nums);
  }

  private int dfs(int i, int total, int[] nums){
    if(i == nums.length) return total;
    return dfs(i+1, total ^ nums[i], nums) + dfs(i+1, total, nums);
  }

  /*
   * Approach 2
   */
  public int XORSum(int[] nums){
    int result = 0;
    for(int i = 0; i < nums.length; ++i) result |= nums[i];
    return (int)(result * Math.pow(2, nums.length-1));
  }
}