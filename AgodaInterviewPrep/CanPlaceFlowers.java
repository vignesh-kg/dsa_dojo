package AgodaInterviewPrep;

public class CanPlaceFlowers {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println("CanPlaceFlower: " + s.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
    System.out.println("CanPlaceFlower: " + s.canPlaceFlowers(new int[]{0,0,0,0,1}, 2));
    System.out.println("CanPlaceFlower: " + s.canPlaceFlowers(new int[]{1,0,0,0,0}, 2));
    System.out.println("CanPlaceFlower: " + s.canPlaceFlowers(new int[]{1,0,0,0,0}, 3));

  }
}

class Solution {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    if(n == 0) return true;
    if(n > flowerbed.length) return false;
    for(int i = 0; i < flowerbed.length; ++i){
      if((i==0 || flowerbed[i-1] == 0) && (flowerbed[i] == 0) && (i==flowerbed.length-1 || flowerbed[i+1] == 0)){
        --n;
        flowerbed[i] = 1;
        if(n == 0) return true;
      }
    }
    return false;
  }
}