#include <iostream>
#include <vector>

using namespace std;

class Solution {
  public:
    vector<int> plusOne(vector<int>& digits) {
      int len = digits.size();
      for(int i = len-1; i >= 0; --i){
        if(digits[i] < 9){
          ++digits[i];
          return digits;
        }
        digits[i] = 0;
      }
      digits.insert(digits.begin(), 1);
      return digits;
    }
};

int main(){
  Solution s;
  vector<int> input = {1,2,3};
  vector<int> result = s.plusOne(input);
  for(int i : result) cout << i << " ";
  cout << endl;
  input = {8,9};
  result = s.plusOne(input);
  for(int i : result) cout << i << " ";
  cout << endl;
  input = {9,9};
  result = s.plusOne(input);
  for(int i : result) cout << i << " ";
  cout << endl;
}