package binarySearch;

public class FindPeakElement {
  public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.findPeakElement(new int[]{1,2,1,3,5,6,4}));
      System.out.println(s.findPeakElement(new int[]{1,2,3,1}));
      System.out.println(s.findPeakElement(new int[]{6,5,4,3,2,3,2}));
      System.out.println(s.findPeakElement(new int[]{3,4,3,2,1}));
  }
}

class Solution{
  public int findPeakElement(int[] nums){
    int length = nums.length;
    if(length < 2) return 0;
    int low = 0, high = length-1;
    int mid;
    while(low <= high){
      mid = low + (high-low)/2;
      if((mid == 0 || nums[mid-1] < nums[mid]) 
        && (mid == nums.length-1 || nums[mid+1] < nums[mid])) return mid;
      else if(mid != 0 && nums[mid-1] > nums[mid]) high = mid-1;
      else low = mid+1;
    }
    return -1;
  }
}