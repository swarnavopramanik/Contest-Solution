https://codeforces.com/contest/1999/problem/C

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
        int n, s, p;
        cin >> n >> s >> p;
        
        vector<pair<int, int>> intervals(n);
        for (int i = 0; i < n; i++) {
          cin >> intervals[i].first >> intervals[i].second;
        }

        bool shower = false;
        
  
        if (intervals[0].first >= s) {
            shower = true;
        }  
        
        for (int i = 1; i < n; i++) {
            if (intervals[i].first - intervals[i - 1].second >= s) {
                shower = true;
            }
        }
    
        if (p - intervals[n - 1].second >= s) {
            shower = true;
        }
        
        if (shower) {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
    }
    return 0;

}
