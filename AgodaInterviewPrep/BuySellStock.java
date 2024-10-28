package AgodaInterviewPrep;

public class BuySellStock {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println("max Profit : " + s.maxProfit(new int[]{7,1,5,3,6,4}));
  }
}

class Solution {
  public int maxProfit(int[] prices) {
    int maxProfit = Integer.MIN_VALUE, minBuyingPrice = Integer.MAX_VALUE;
    for(int price : prices){
      if(minBuyingPrice > price) minBuyingPrice = price;
      if(maxProfit < (price-minBuyingPrice)) maxProfit = price-minBuyingPrice;
    }
    return maxProfit;
  }
}