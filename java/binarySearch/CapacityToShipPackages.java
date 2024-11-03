package binarySearch;

public class CapacityToShipPackages {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.shipWithinDays(new int[]{3,2,2,4,1,4}, 3));
    System.out.println(s.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 1));
  }
}

class Solution {
  public int shipWithinDays(int[] weights, int days) {
    int minCapacityRequired = 0, maxCapacityRequired = 0;
    for(int weight : weights){
      minCapacityRequired = Math.max(minCapacityRequired, weight);
      maxCapacityRequired += weight;
    }
    int left = minCapacityRequired, right = maxCapacityRequired;
    while(left < right){
      int mid = left + ((right-left)/2);
      if(daysRequired(mid, weights) <= days){
        right = mid;
      } else {
        left = mid+1;
      }
    }
    return left;
  }

  private int daysRequired(int capacity, int[] weights){
    int daysRequired = 1;
    int curWeight = 0;
    for(int i = 0; i < weights.length; ++i){
      if(curWeight + weights[i] <= capacity){
        curWeight += weights[i];
      } else {
        ++daysRequired;
        curWeight = weights[i];
      }
    }
    return daysRequired;
  }
}