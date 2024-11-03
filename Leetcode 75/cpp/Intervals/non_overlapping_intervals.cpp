#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    int eraseOverlapIntervals(vector<vector<int>>& intervals) {
      ios_base::sync_with_stdio(false);
      struct Pair {
        int first;
        int second;
      };
      int n = intervals.size();
      Pair pairs[n];
      for (int i = 0; i < n; ++i) {
        pairs[i].first = intervals[i][0];
        pairs[i].second = intervals[i][1];
      }

      auto compare = [](const Pair a, const Pair b){
        return a.second < b.second;
      };
      sort(pairs, pairs+n, compare);
      int overlappingIntervals = 0;
      int prevEnd = pairs[0].second;
      for(int i = 1; i < n; ++i){
        if(prevEnd > pairs[i].first) {
          ++overlappingIntervals;
        } else {
          prevEnd = pairs[i].second;
        }
      }
      return overlappingIntervals;
    }
};

int main(){
  Solution s;
  vector<vector<int>> intervals = {{1,2}, {2,3}, {3,4}, {1,3}};
  cout << s.eraseOverlapIntervals(intervals) << endl;
}