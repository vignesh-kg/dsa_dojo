import java.util.ArrayList;
import java.util.List;

public class MaxCandies {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.kidsWithCandies(new int[] {2,3,5,1,3}, 3));
  }
}

class Solution{
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
    List<Boolean> result = new ArrayList<>();
    int maxCandy = candies[0];
    for(int i = 1; i < candies.length; ++i){
      if(maxCandy < candies[i]) maxCandy = candies[i];
    }
    for(int i = 0; i < candies.length; ++i){
      result.add(candies[i]+extraCandies >= maxCandy);
    }
    return result;
  }
}