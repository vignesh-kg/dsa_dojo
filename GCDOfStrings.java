public class GCDOfStrings {
  public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.gcdOfString("ababab", "ab"));
      System.out.println(s.gcdOfString("ababab", "abc"));
      System.out.println(s.gcdOfString("abcabc", "abc"));
      System.out.println(s.gcdOfString("leet", "code"));
  }
}

class Solution{
  public String gcdOfString(String str1, String str2){
    return (str1+str2).equals(str2+str1) ? str1.substring(gcd(str1.length(), str2.length())) : "";
  }

  private int gcd(int l1, int l2){
    return l2 == 0 ? l1 : gcd(l2, l1%l2);
  }
}
