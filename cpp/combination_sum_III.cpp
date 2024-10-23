#include <iostream>
#include <vector>

using namespace std;

class Solution{
  public:
    vector<vector<int>> combinationSum3(int k, int n){
      vector<vector<int>> result;
      vector<int> subset;
      int total = 0;
      backtrack(1, subset, total, result, k, n);
      return result;
    }
  private:
    void backtrack(int index, vector<int>& subset, int total, vector<vector<int>>& result,
      int size, int target){
        if(total == target && subset.size() == size){
          result.push_back(subset);
          return;
        }
        
        for(int i = index; i <= 9; ++i){
          int curTotal = total + i;
          if(curTotal <= target){
            subset.push_back(i);
            backtrack(i+1, subset, curTotal, result, size, target);
            subset.pop_back();
          } else return;
        }
    }
};

int main(){
  Solution s;
  vector<vector<int>> result = s.combinationSum3(3, 9);
  for(vector<int> res : result){
    for(int i : res) cout << i << ",";
    cout << endl;
  }
}