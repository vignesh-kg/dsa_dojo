#include <iostream>
#include <string>

class Solution{
  public:
    std::string mergeAlternately(std::string str1, std::string str2){
        int l1 = str1.length(), l2 = str2.length();
        int i = 0, j = 0;
        std::string result = "";
        while(i < l1 && j < l2){
          result += str1[i];
          result += str2[j];
          ++i; ++j;
        }
        if(i < l1) result += str1.substr(i);
        if(j < l2) result += str2.substr(j);
        return result;
    }
};

int main(){
  Solution s;
  std::cout << s.mergeAlternately("abc", "pqrs") << std::endl;
  std::cout << s.mergeAlternately("ab", "pqrs") << std::endl;
}