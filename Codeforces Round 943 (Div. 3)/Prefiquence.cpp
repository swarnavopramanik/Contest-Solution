https://codeforces.com/contest/1968/problem/B

#include <bits/stdc++.h>

using namespace std;



int main() {
     int t;
    cin >> t;
    while (t--) {
        int n, m;
        cin >> n >> m;
        string a, b;
        cin >> a >> b;

        int maxk = 0;
        int i = 0;  
        int j = 0;  

        while (j < m) {
            if (i < n && a[i] == b[j]) {
                i++;
            }
            j++;
            maxk = max(maxk, i);
            if (i == n) {
              
                break;
            }
        }

        cout << maxk << endl;
    }
    return 0;
}
