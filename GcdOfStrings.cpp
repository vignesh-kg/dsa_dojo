#include <iostream>
#include <string>

class Solution{
    public:
        std::string gcdOfString(std::string str1, std::string str2){
            return (str1+str2 == str2+str1) ? str1.substr(0, gcd(str1.length(), str2.length())) : "";
        }
    private:
        int gcd(int l1, int l2){
            return l2 == 0 ? l1 : gcd(l2, l1%l2);
        }
};

int main(){
    Solution s;
    std::cout << s.gcdOfString("ABCABC", "ABC") << std::endl;
    std::cout << s.gcdOfString("LEET", "CODE") <<std::endl;
}