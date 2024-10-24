#include <iostream>
#include <vector>
#include <queue>

using namespace std;

class Solution{
  public:
    int findKthLargest(vector<int>& nums, int k){
      priority_queue<int> pq;
      for(int i = 0; i < nums.size(); ++i){
        pq.push(nums[i]);
      }
      int result = -1;
      for(int i = 0; i < k; ++i){
        result = pq.top();
        pq.pop();
      }
      return result;
    }
};

int main(){
  vector<int> input = {3,2,1,5,6,4};
  Solution s;
  cout << s.findKthLargest(input, 2) << endl;
}