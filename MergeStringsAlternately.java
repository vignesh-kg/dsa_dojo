public class MergeStringsAlternately{
  public static void main(String[] args){
    Solution s = new Solution();
    System.out.println(s.mergedString("abc", "pqrs"));
    System.out.println(s.mergedString("abcde", "pqr"));
    System.out.println(s.mergedString("", ""));
  }
}

class Solution{
  public String mergedString(String str1, String str2){
    StringBuilder res = new StringBuilder();
    int l1 = str1.length(), l2 = str2.length();
    char[] ch1 = str1.toCharArray();
    char[] ch2 = str2.toCharArray();
    int i = 0;
    while(i < l1 || i < l2){
      if(i < l1) res.append(ch1[i]);
      if(i < l2) res.append(ch2[i]);
      ++i;
    }
    return res.toString();
  }
}