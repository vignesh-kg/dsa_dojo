#include <iostream>
#include <vector>
#include <unordered_set>

class Solution{
  public:
    bool containsDuplicate(std::vector<int>& nums){
        std::unordered_set<int> s;
        for(int num : nums){
            if(!s.insert(num).second) return true;
        }
        return false;
    }
};

int main(){
    Solution s;
    std::vector<int> nums = {1,2,3,1};
    if(s.containsDuplicate(nums)) std::cout << "Duplicate Present" << std::endl;
}