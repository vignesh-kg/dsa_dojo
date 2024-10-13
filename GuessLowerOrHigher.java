public class GuessLowerOrHigher {
  public static void main(String[] args){
    Solution s = new Solution();
    s.guessNumber = 6;
    System.out.println(s.guessNumber(10));
    s.guessNumber = 27814230;
    System.out.println(s.guessNumber(131904690));

  }
}

class Solution{
  int guessNumber;
  private int guess(int num){
    if(num == this.guessNumber) return 0;
    else if(num < this.guessNumber) return 1;
    else return -1;
  }

  public int guessNumber(int n){
    int low = 0, high = n;
    int mid, guess;
    while(low <= high){
      mid = low + (high - low)/2;
      guess = guess(mid);
      if(guess == 0) return mid;
      else if (guess > 0) low = mid + 1;
      else high = mid -1;
    }
    return -1;
  }
}