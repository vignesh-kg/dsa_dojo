import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams{
    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        for(List<String> group : new Solution().groupAnagrams(strs)){
            System.out.println(group);
        }
    }
}

class Solution{
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> result = new HashMap<>();
        for(int i = 0; i < strs.length; ++i){
            String s = strs[i];
            int[] chars = new int[26];
            for(char ch : s.toCharArray()) ++chars[ch - 'a'];
            String key = Arrays.toString(chars);
            if(!result.containsKey(key)) result.put(key, new ArrayList<>());
            result.get(key).add(s);
        }
        return new ArrayList(result.values());
    }
}