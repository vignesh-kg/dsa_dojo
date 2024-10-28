#include <iostream>
#include <vector>

using namespace std;

class Solution {
  public:
    int numberOfChild(int n, int k) {
      if(k >= 2*(n-1)) k %= (2*(n-1));
      if(k >= (n-1)){
        k %= (n-1);
        return n-1-k;
      }
      return k;
    }
};

int main(){
  Solution s;
  cout << s.numberOfChild(3, 5) << endl;
  cout << s.numberOfChild(5, 6) << endl;
}