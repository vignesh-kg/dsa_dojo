public class ContainerWithMostWater {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    System.out.println(s.maxArea(new int[]{1,1}));
    System.out.println(s.maxArea(new int[]{1}));
  }
}

class Solution{
  public int maxArea(int[] height){
    int maxArea = 0;
    int left = 0, right = height.length-1;
    int curArea;
    while(left < right){
      int h = Math.min(height[left], height[right]);
      curArea = (right-left) * h;
      if(maxArea < curArea) maxArea = curArea;
      while(left < right && height[left] <= h) ++left;
      while(left < right && height[right] <= h) --right;
    }
    return maxArea;
  }
}