Given a two-digit positive integer n, find the sum of its digits.

Input
The first line contains an integer t
 (1≤t≤90) — the number of test cases.

The only line of each test case contains a single two-digit positive integer n
 (10≤n≤99).

Output
For each test case, output a single integer — the sum of the digits of n

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
        int n;
        cin >> n;
        int sum = (n / 10) + (n % 10);  
        cout << sum << endl;
    }
    return 0;

}

