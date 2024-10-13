import java.util.Arrays;

public class MaxKSumPairs {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.maxOperations(new int[] { 3, 5, 1, 5 }, 2));
    System.out.println(s.maxOperations(new int[] { 1, 2, 3, 4 }, 5));
    System.out.println(s.maxOperations(new int[] { 3, 1, 3, 4, 3 }, 6));
    System.out.println(s.maxOperations(new int[] { 2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2 }, 3));
  }
}

class Solution {
  /*
   * Approach 1: Using HashMap
   * Time Complexity : O(n)
   * Space Complexity: O(n) as we are using HashMap
   * 
   * public int maxOperations(int[] nums, int k){
   * int maxOperations = 0;
   * Map<Integer, Integer> diffMap = new HashMap<>();
   * int diff;
   * for(int i = 0; i < nums.length; ++i){
   * if(nums[i] <= k){
   * diff = k - nums[i];
   * if(diffMap.containsKey(diff)){
   * ++maxOperations;
   * if(diffMap.get(diff) > 1) diffMap.put(diff, diffMap.get(diff)-1);
   * else diffMap.remove(diff);
   * } else diffMap.put(nums[i], diffMap.getOrDefault(nums[i], 0)+1);
   * }
   * }
   * return maxOperations;
   * }
   */
  /*
   * Approach 2: Using 2 pointers and sorting
   * Time Complexity: O(n logn) + O(n)
   * Space Complexity: O(1)
   */
  public int maxOperations(int[] nums, int k) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= k)
        nums[i] = 0;
    }
    int maxOperations = 0;
    Arrays.sort(nums);
    int left = 0, right = nums.length - 1;
    int sum;
    while (left < right) {
      sum = nums[left] + nums[right];
      if (sum == k) {
        ++maxOperations;
        ++left;
        --right;
      } else if (sum < k)
        ++left;
      else
        --right;
    }
    return maxOperations;
  }
}