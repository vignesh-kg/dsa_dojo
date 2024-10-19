public class UniquePaths{
  public static void main(String[] args){
    Solution s = new Solution();
    System.out.println(s.uniquePaths(3, 7));
    System.out.println(s.uniquePaths(51, 9));
  }
}

class Solution{
  public int uniquePaths(int m, int n){
    n = m + n -2;
    int r = m-1;
    long result = 1;
    for(int i =1; i <= r; ++i){
      result *= (n-i+1);
      result /= i;
    }
   
    return (int)result;
  }
}