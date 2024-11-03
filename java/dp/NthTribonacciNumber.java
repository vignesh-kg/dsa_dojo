package dp;

public class NthTribonacciNumber {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.tribonacci(4));
  }
}

class Solution {
  public int tribonacci(int n) {
    if(n == 0) return 0;
    if(n == 1 || n == 2) return 1;

    int i = 0, j = 1, k = 1;
    int temp;
    for(int c = 3; c <= n; ++c){
      temp = k;
      k = i + j + k;
      i = j;
      j = temp;
    }
    return k;
  }
}