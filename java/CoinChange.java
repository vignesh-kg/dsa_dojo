
public class CoinChange{
  public static void main(String[] args){
    Solution s = new Solution();
    System.out.println(s.coinChange(new int[]{186,419,83,408}, 6249));
  }
}

class Solution {
  public int coinChange(int[] coins, int amount) {
      int requiredCoins = 0;
      boolean[] used = new boolean[coins.length];
      backtrack(coins, 0, requiredCoins, amount, used);
      return requiredCoins;
  }

  private void backtrack(int[] coins, int curCoins, int requiredCoins, int amount, boolean[] used){
    if(amount == 0){
      requiredCoins = Math.min(requiredCoins, curCoins);
      System.out.println("requiredCoins: " + requiredCoins);
      return;
    }

    for(int i = 0; i < coins.length; ++i){
      if(used[i]) continue;
      used[i] = true;
      backtrack(coins, curCoins + (amount/coins[i]), requiredCoins, amount%coins[i], used);
      used[i] = false;
      backtrack(coins, curCoins, requiredCoins, amount, used);
    }
  }
}