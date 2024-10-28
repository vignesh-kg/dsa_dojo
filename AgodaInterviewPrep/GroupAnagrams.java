package AgodaInterviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
  public static void main(String[] args) {
    Solution s = new Solution();
    for(List<String> sub : s.groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"})){
      System.out.println(sub);
    }
  }
}

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for(String s : strs) {
      int[] chars = new int[26];
      for(char ch : s.toCharArray()){
        ++chars[ch - 'a'];
      }
      String key = Arrays.toString(chars);
      if(!map.containsKey(key)) map.put(key, new ArrayList<>());
      map.get(key).add(s);
    }
    return new ArrayList<>(map.values());
  }
}