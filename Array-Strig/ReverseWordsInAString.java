public class ReverseWordsInAString {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.reverseWords("the sky is blue"));
    System.out.println(s.reverseWords("  hello world  "));
    System.out.println(s.reverseWords("a good   example"));
  }
}

class Solution{
  public String reverseWords(String s) {
    s = s.trim();
    String[] sArr = s.split("\\s+");
    int i = sArr.length-1;
    StringBuilder res = new StringBuilder();
    while(i >= 0){
      if(!sArr[i].equals("")){
        res.append(sArr[i]);
        if(i != 0) res.append(" "); 
      } 
      --i;
    }
    return res.toString();
  }
}
