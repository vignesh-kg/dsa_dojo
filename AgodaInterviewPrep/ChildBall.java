package AgodaInterviewPrep;

public class ChildBall {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.numberOfChild(3, 5));
    System.out.println(s.numberOfChild(5, 6));
  }
}

class Solution {
  public int numberOfChild(int n, int k) {
      if(k >= 2*(n-1)) k %= 2*(n-1);
      if(k >= (n-1)){
          k %= (n-1);
          return n-k-1;
      } else return k;
  }
}