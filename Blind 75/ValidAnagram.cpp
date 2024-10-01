#include <iostream>
#include <vector>

class Solution{
  public:
    bool isAnagram(std::string s, std::string t){
      if(s.size() != t.size()) return false;
      std::vector<int> chars(26);
      for(char ch : s) ++chars[ch - 'a'];
      for(char ch : t) --chars[ch - 'a'];
      for(int ch : chars){
        if(ch != 0) return false;
      }
      return true;
    }
};

int main(){
    Solution sol;
    std::string s = "car", t = "rac";
    if(sol.isAnagram(s, t)) std::cout << s << " and " << t << " are valid Anagrams" << std::endl;
    else std::cout << "Not valid Anagrams" << std::endl;
    s = "car", t = "race";
    if(sol.isAnagram(s, t)) std::cout << s << " and " << t << " are valid Anagrams" << std::endl;
    else std::cout << "Not valid Anagrams" << std::endl;
}