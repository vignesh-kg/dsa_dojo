package AgodaInterviewPrep;

public class FirstUniqueChar {
  public static void main(String[] args) {
    Solution s = new Solution();
    String str = "leetcode";
    int index = s.firstUniqChar(str);
    if(index != -1){
      System.out.println(str.charAt(index));
    } else {
      System.out.println(index);
    }
    str = "aabb";
    index = s.firstUniqChar(str);
    if(index != -1){
      System.out.println(str.charAt(index));
    } else {
      System.out.println(index);
    }
  }
}

class Solution {
  public int firstUniqChar(String s) {
    int[] chars = new int[26];
    char[] sArr = s.toCharArray();
    for(char ch : sArr){
      ++chars[ch - 'a'];
    }
    for(int i = 0; i < sArr.length; ++i){
      if(chars[sArr[i]-'a'] == 1) return i;
    }
    return -1;
  }
}