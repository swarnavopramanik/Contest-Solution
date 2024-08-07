https://codeforces.com/contest/1999/problem/B

#include <bits/stdc++.h>
using namespace std;
int inf = 1e9;
int mod = 1e9 + 7;
 
#define IOS                \
  ios::sync_with_stdio(0); \
  cin.tie(0);              \
  cout.tie(0);
 
int main() {
  IOS int t;
    cin >> t;
    
    while (t--) {
        int a[2], b[2];
        cin >> a[0] >> a[1] >> b[0] >> b[1];
        
        int wins = 0;
        int win1 = 0, win2 = 0;
        
        win1 = (a[0] > b[0]) + (a[1] > b[1]);
        win2 = (a[0] < b[0]) + (a[1] < b[1]);
        if (win1 > win2) wins++;
        
        win1 = (a[0] > b[1]) + (a[1] > b[0]);
        win2 = (a[0] < b[1]) + (a[1] < b[0]);
        if (win1 > win2) wins++;
        
        win1 = (a[1] > b[0]) + (a[0] > b[1]);
        win2 = (a[1] < b[0]) + (a[0] < b[1]);
        if (win1 > win2) wins++;
        
        win1 = (a[1] > b[1]) + (a[0] > b[0]);
        win2 = (a[1] < b[1]) + (a[0] < b[0]);
        if (win1 > win2) wins++;
        
        cout << wins << endl;
    }
    
    return 0;
}
