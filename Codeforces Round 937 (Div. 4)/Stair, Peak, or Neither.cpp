https://codeforces.com/contest/1950/problem/A

#include <iostream>
using namespace std;
 
int main() {
  int t;
  cin >> t;
  while(t--) {
    int n;
    cin >> n;
 
    bool flag = true;
 
    for(int i = 0; i < n; i++) {
 
      bool f = flag;
 
      //1st layer
      for(int j = 0; j < n; j++) {
        if(f) {
          cout << "##";
        }
        else {
          cout << "..";
        }
        f = !f;
      } 
 
      cout << endl;
      //2nd layer
      f = flag;
      for(int j = 0; j < n; j++) {
        if(f) {
          cout << "##";
        }
        else {
          cout << "..";
        }
        f = !f;
      } 
      
      cout << endl;
      flag = !flag;
    }
  }
  return 0;
}
 
