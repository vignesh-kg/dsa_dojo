#include <iostream>
#include <vector>
#include <algorithm>
#include <chrono>
#include <random>

using namespace std;

class Solution{
  public:
    int eraseOverlappingIntervals(vector<vector<int>>& intervals){
      stable_sort(intervals.begin(), intervals.end(), [](const vector<int>& a, const vector<int>& b){
        return a[1] < b[1];
      });
      int overlappingIntervals = 0;
      int prevEnd = intervals[0][1];
      for(int i = 1; i < intervals.size(); ++i){
        if(intervals[i][0] >= prevEnd ) prevEnd = intervals[i][1];
        else{
          ++overlappingIntervals;
          if(prevEnd < intervals[i][i]) prevEnd = intervals[i][1];
        }
      }
      return overlappingIntervals;
    }
};

vector<vector<int>> generateRandomIntervals(int numIntervals, int minTime, int maxTime) {
    vector<vector<int>> intervals;
    std::mt19937 rng(std::random_device{}());
    std::uniform_int_distribution<> dist(minTime, maxTime);
    int minIntervalDuration = 10;
    for (int i = 0; i < numIntervals; ++i) {
        int startTime = dist(rng);
        int endTime = startTime + dist(rng);

        vector<int> interval = {startTime, endTime};
        intervals.emplace_back(interval);
    }

    return intervals;
}

int main(){
  Solution s;
  //vector<vector<int>> intervals = {{1,2}, {2,3}, {3,4}, {1,3}};
  vector<vector<int>> intervals = generateRandomIntervals(10000, 0, 90);
  auto start = chrono::high_resolution_clock::now();
  cout << s.eraseOverlappingIntervals(intervals) << endl;
  auto end = chrono::high_resolution_clock::now();
  auto elapsed_nanoseconds = chrono::duration_cast<chrono::nanoseconds>(end - start).count();
  auto elapsed_milliseconds = elapsed_nanoseconds / 1000000;
  cout << "execution time :" << elapsed_milliseconds << endl;
}