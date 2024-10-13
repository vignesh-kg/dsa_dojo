

public class ReverseVowelsOfString {
  public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.reverseVowels("IceCreAm"));
  }
}

class Solution{
  public String reverseVowels(String s){
    char[] sArr = s.toCharArray();
    int i = 0, j = sArr.length-1;
    while(i < j){
      if(isVowel(sArr[i]) && isVowel(sArr[j])){
        char temp = sArr[i];
        sArr[i] = sArr[j];
        sArr[j] = temp;
        ++i; --j;
      } else if (isVowel(sArr[i])) --j;
      else if (isVowel(sArr[j])) ++i;
      else {
        ++i; --j;
      }
    }
    return new String(sArr);
  }

  private boolean isVowel(char ch){
    return switch(ch){
      case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I',
        'O', 'U' -> true;
      default -> false;
    };
  }
}
