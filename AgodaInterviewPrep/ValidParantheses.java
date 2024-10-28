package AgodaInterviewPrep;

import java.util.Stack;

public class ValidParantheses {
  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(s.isValid("([])"));
    System.out.println(s.isValid("(])"));
  }
}

class Solution {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for(char ch : s.toCharArray()){
      switch(ch){
        case '(' -> stack.push(')');
        case '[' -> stack.push(']');
        case '{' -> stack.push('}');
        default -> {
          if (stack.isEmpty() || ch != stack.pop()) return false;
        }
      }
    }
    if(stack.isEmpty()) return true;
    return false;
  }
}