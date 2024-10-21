import java.util.LinkedList;
import java.util.List;

public class LetterCombination {
  public static void main(String[] args){
    Solution s = new Solution();
    System.out.println(s.letterCombinations("23"));
    System.out.println(s.letterCombinations(""));
  }
}

class Solution{
  String[] combinations = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
  public List<String> letterCombinations(String digits) {
    LinkedList<String> result = new LinkedList<>();
    if(digits.isEmpty()) return result;
    StringBuilder temp = new StringBuilder();
    backtrack(0, temp, result, digits.toCharArray());
    return result;
  }

  private void backtrack(int index, StringBuilder temp, List<String> result, char[] digits){
    if(index >= digits.length){
      result.add(temp.toString());
      return;
    }
    char[] combination = combinations[Character.getNumericValue(digits[index])].toCharArray();
    for(int i = 0; i < combination.length; ++i){
      temp.append(combination[i]);
      backtrack(index+1, temp, result, digits);
      temp.deleteCharAt(temp.length()-1);
    }
  }
}