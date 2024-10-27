import java.util.HashSet;
import java.util.Set;

public class LongestString {
  public static void main(String[] args){
    Solution s = new Solution();
    System.out.println(s.lengthOfLongestSubstring("abcabc"));
  }
}


class Solution {
  public int lengthOfLongestSubstring(String s) {
      int maxLength = 0;
      char[] sArr = s.toCharArray();
      Set<Character> substringSet = new HashSet<>();
      int left = 0;
      for(int i = 0; i < sArr.length; ++i){
        while(left < i && substringSet.contains(sArr[i])){
          substringSet.remove(sArr[left]);
          ++left;
        }
        substringSet.add(sArr[i]);
        maxLength = Math.max(maxLength, (i-left+1));
      }

      return maxLength;
  }
}