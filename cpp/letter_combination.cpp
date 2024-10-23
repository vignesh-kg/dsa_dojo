#include <iostream>
#include <vector>

using namespace std;

class Solution{
  public:
    vector<string> combinations = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    vector<string> letterCombinations(string digits){
      vector<string> result;
      if(digits.empty()) return result;
      backtrack(0, "", result, digits);
      return result;
    }
  private:
    void backtrack(int index, string temp, vector<string>& result, string digits){
      if(index >= digits.size()){
        string temp1(temp.begin(), temp.end());
        result.push_back(temp1);
        return;
      }
      string combination = combinations[digits[index]-'0'];
      for(int i = 0; i < combination.size(); ++i){
        temp += combination[i];
        backtrack(index+1, temp, result, digits);
        temp.erase(temp.size()-1);
      }
    }
};

int main(){
  Solution s;
  vector<string> result = s.letterCombinations("23");
  for(string s : result){
    cout << s << ",";
  }
  cout << endl;
  result = s.letterCombinations("");
  for(string s : result){
    cout << s << ",";
  }
  cout << endl;
}