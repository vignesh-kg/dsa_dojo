#include <iostream>

using namespace std;

int main(){
  long input;
  cin >> input;
  cout << input << " ";
  while(input != 1){
    if(input % 2 == 0 ){
      input /= 2;
    } else {
      input = (input * 3) +1;
    }
    if(input != 1)cout << input << " ";
    else cout << input << endl;
  }
}