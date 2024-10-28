package AgodaInterviewPrep;

import java.util.Arrays;

public class PlusOne {
  public static void main(String[] args){
    Solution s = new Solution();
    System.out.println(Arrays.toString(s.plusOne(new int[] {4,3,2,1})));
    System.out.println(Arrays.toString(s.plusOne(new int[] {9})));
    System.out.println(Arrays.toString(s.plusOne(new int[] {8,9,9})));
  }
}

class Solution {
  public int[] plusOne(int[] digits) {
    int len = digits.length;
    for(int i = len-1; i >= 0; --i){
      if(digits[i] < 9) {
        ++digits[i];
        return digits;
      }
      digits[i] = 0;
    }

    int[] result = new int[len+1];
    result[0] = 1;
    return result;
  }
}