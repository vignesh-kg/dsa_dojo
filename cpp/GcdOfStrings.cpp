#include <iostream>

using namespace std;

class Solution{
  public:
    string gcdOfStrings(string str1, string str2){
      int g = gcd(str1.size(), str2.size());
      return (str1+str2 == str2+str1) ? str1.substr(0, g) : "";
    }
  private:
    int gcd(int l1, int l2){
      return l2 == 0 ? l1 : gcd(l2, l1%l2);
    }
};

int main(){
  Solution s;
  cout << s.gcdOfStrings("abcabc", "abc") << endl;
  cout << s.gcdOfStrings("ababab", "ab") << endl;
  cout << s.gcdOfStrings("leet", "code") << endl;
}