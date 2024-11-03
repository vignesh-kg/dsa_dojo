package binarySearch;

import java.util.Arrays;

public class KokoEatingBanana {
  public static void main(String[] args){
    Solution s = new Solution();
    System.out.println(s.minEatingSpeed(new int[]{3,6,7,11}, 8));
  }
}

class Solution{
  public int minEatingSpeed(int[] piles, int h){
    Arrays.sort(piles); //TC : O(n log n)
    int low = 1, high = piles[piles.length-1];
    int mid;
    while(low < high){ //TC: O(log n)
      mid = low + (high-low)/2;
      int eatingSpeed = eatingSpeed(mid, piles);
      if(eatingSpeed <= h) high = mid;
      else low = mid+1;
    }
    return high;
  }

  private int eatingSpeed(int speed, int[] piles){
    int eatingSpeed = 0;
    for(int pile: piles){ //O(n)
      eatingSpeed += pile/speed;
      if(pile%speed != 0) ++eatingSpeed;
    }
    return eatingSpeed;
  }
}