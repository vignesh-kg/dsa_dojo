#include <iostream>

using namespace std;

class Solution{
  public:
    string mergeStrings(string str1, string str2){
      int l1 = str1.size(), l2 = str2.size();
      int i = 0;
      string res = "";
      while(i < l1 || i < l2){
        if(i < l1) res += str1[i];
        if(i < l2) res += str2[i];
        ++i;
      }
      return res;
    }
};

int main(){
  Solution s;
  cout << s.mergeStrings("abcde", "pqr") << endl;
  cout << s.mergeStrings("abc", "pqrs") << endl;
  cout << s.mergeStrings("leet", "code") << endl;
}