package binarySearch;

import java.util.Arrays;

public class SuccessFulPotion {
  public static void main(String[] args) {
    Solution s = new Solution();
    int[] result = s.successfulPairs(new int[]{5,1,3}, new int[]{1,2,3,4,5}, 7);
    for(int i = 0; i < result.length; ++i) System.out.print(result[i] + " ");
    System.out.print("\n");
  }
}

class Solution{
  public int[] successfulPairs(int[] spells, int[] potions, long success){
    int[] result = new int[spells.length];
    Arrays.sort(potions); //TC: O(potions.length log potions.length)
    int low = 0, high = potions.length-1;
    int mid;
    for(int i = 0; i < spells.length; ++i){ //TC: O(spells.length)
      while(low <= high){
        mid = low + (high-low)/2;
        long product = (long) potions[mid]*spells[i];
        if(product >= success) high = mid-1;
        else low = mid+1;
      }
      result[i] = potions.length-high-1;
      low = 0; high = potions.length-1;
    }
    return result;
  }
}