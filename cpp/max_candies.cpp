#include <iostream>
#include <vector>

using namespace std;

class Solution{
  public:
    vector<bool> kids_with_candies(vector<int>& candies, int extraCandy){
      int maxCandy = candies[0];
      for(int i = 1; i < candies.size(); ++i){
        if(maxCandy < candies[i]) maxCandy = candies[i];
      }
      vector<bool> result(candies.size());
      for(int i = 0; i < candies.size(); ++i){
        if(candies[i]+extraCandy >= maxCandy) result[i] = true;
      }

      return result;
    }
};

int main(){
  Solution s;
  vector<int> candies = {2,3,5,1,3};
  vector<bool> result = s.kids_with_candies(candies, 3);
  for(bool res : result) cout << (res ? "true" : "false") << ", ";
  cout << endl;
}