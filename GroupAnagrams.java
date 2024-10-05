import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams{
  public static void main(String[] args){
    Solution s = new Solution();
    for(List list : s.groupAnagrams(Arrays.asList("eat", "tea", "tan", "ant"))) 
      System.out.println(list);
  }
}

class Solution{
  public List<List<String>> groupAnagrams(List<String> words){
    Map<String, List<String>> map = new HashMap<>();
    int[] chars;
    for(String str : words){
      chars = new int[26];
      for(char ch : str.toCharArray()) ++chars[ch - 'a'];
      String key = Arrays.toString(chars);
      if(!map.containsKey(key)) map.put(key, new ArrayList<>());
      map.get(key).add(str);
    }
    return new ArrayList<>(map.values());
  }
}