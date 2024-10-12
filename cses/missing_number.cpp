#include <iostream>

using namespace std;

int main(){
  long n;
  cin >> n;
  long totalSum = 0;
  long num;
  for(int i = 0; i < n-1; ++i){
    cin >> num;
    totalSum += num;
  }
  cout << (((n * (n+1))/2) - totalSum) << endl;
}