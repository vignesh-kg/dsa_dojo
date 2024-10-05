import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures{
  public static void main(String[] args){
    Solution s = new Solution();
    int[] output = s.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
    System.out.print("[");
    for(int i : output){
      System.out.print(i + ",");
    }
    System.out.print("""
                     ]
                     """);
    String expected = "[1, 1, 4, 2, 1, 1, 0, 0]";
    assert expected.equals(Arrays.toString(output));
  }
}

class Solution{
  public int[] dailyTemperatures(int[] temperatures){
    int length = temperatures.length;
    int[] result = new int[length];
    Stack<Integer> stack = new Stack<>();
    for(int i = 0; i < length; ++i){
      while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
        result[stack.peek()] = i - stack.pop();
      }
      stack.push(i);
    }
    return result;
  }
}