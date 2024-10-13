public class IsSubsequence {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.isSubsequence("abc", "ahbgdc"));
    System.out.println(s.isSubsequence("abx", "ahbgdc"));
    System.out.println(s.isSubsequence("abcd", "abc"));
    System.out.println(s.isSubsequence("abc", "abc"));
    System.out.println(s.isSubsequence("", "abc"));
    System.out.println(s.isSubsequence("abc", ""));
  }
}

class Solution{
  public boolean isSubsequence(String s, String t){
    if(s.isEmpty()) return true;
    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();
    int sLen = sArr.length, tLen = tArr.length;
    if(sLen > tLen) return false;
    int i = 0, j = 0;
    while(j < tLen){
      if(sArr[i] == tArr[j]){
        ++i;
        if(i == sLen) return true;
      }
      ++j;
    }
    
    return false;
  }
}