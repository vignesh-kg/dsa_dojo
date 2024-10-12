public class StringCompression {
  public static void main(String[] args) {
    Solution s = new Solution();
    char[] input = new char[]{'a','a','b','b','c','c','c'};
    int length = s.compress(input);
    for(int i = 0; i < length; ++i) System.out.print(input[i]);
    System.out.print("\n");
    input = new char[]{'a'};
    length = s.compress(input);
    for(int i = 0; i < length; ++i) System.out.print(input[i]);
    System.out.print("\n");
    input = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    length = s.compress(input);
    for(int i = 0; i < length; ++i) System.out.print(input[i]);
    System.out.print("\n");
    input = new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'c'};
    length = s.compress(input);
    for(int i = 0; i < length; ++i) System.out.print(input[i]);
    System.out.print("\n");
  }
}

class Solution{
  public int compress(char[] chars){
    int lnOfCmpressedStr = 1, pointer = 0, curCount = 1;
    char curr = chars[0];
    for(int i = 1; i < chars.length; ++i){
      if(chars[i] == curr) ++curCount;
      else {
        if(curCount == 1) {
          chars[pointer] = curr;
          ++pointer;
          ++lnOfCmpressedStr;
        } else {
          chars[pointer] = curr;
          ++pointer;
          ++lnOfCmpressedStr;
          if(curCount >= 10){
            String count = String.valueOf(curCount);
            for(char ch : count.toCharArray()){
              chars[pointer] = ch;
              ++pointer;
              ++lnOfCmpressedStr;
            }
          } else {
            chars[pointer] = Character.forDigit(curCount, 10);
            ++pointer;
            ++lnOfCmpressedStr;
          }
        }
        curCount = 1;
        curr = chars[i];
      }
    }

    if(curCount == 1) {
      chars[pointer] = curr;
      ++pointer;
      ++lnOfCmpressedStr;
    } else {
      chars[pointer] = curr;
      ++pointer;
      ++lnOfCmpressedStr;
      if(curCount >= 10){
        String count = String.valueOf(curCount);
        for(char ch : count.toCharArray()){
          chars[pointer] = ch;
          ++pointer;
          ++lnOfCmpressedStr;
        }
      } else {
        chars[pointer] = Character.forDigit(curCount, 10);
        ++pointer;
        ++lnOfCmpressedStr;
      }
    }
    return lnOfCmpressedStr == 1 ? 1 : lnOfCmpressedStr-1;
  }
}