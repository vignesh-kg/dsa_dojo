#include <iostream>
#include <unordered_map>
#include <vector>

class Solution{
  public:
    std::vector<int> twoSum(std::vector<int>& nums, int target){
        std::unordered_map<int, int> diff_map;
        int diff = 0;
        for(int i = 0; i < nums.size(); ++i){
          diff = target - nums[i];
          if(diff_map.find(diff) != diff_map.end()) return {diff_map[diff], i};
          diff_map[nums[i]] = i;
        }
        return {-1, -1};
    }
};

int main(){
  Solution s;
  std::vector<int> nums = {2, 7, 11, 15};
  std::vector<int> result = s.twoSum(nums, 18);
  std::cout<< result[0] << " " << result[1] << std::endl;
}