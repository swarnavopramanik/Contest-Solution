https://codeforces.com/contest/1971/problem/C

#include <bits/stdc++.h>

using namespace std;

int normalize(int num) {
    return ((num - 1) % 12) + 1;
}

bool doIntersect(int a, int b, int c, int d) {
    if (a > b) swap(a, b);
    if (c > d) swap(c, d);

    // Sorting the points to easily compare positions
    int points[4] = {a, b, c, d};
    sort(points, points + 4);
    
    if ((points[0] == a && points[1] == c && points[2] == b && points[3] == d) ||
        (points[0] == c && points[1] == a && points[2] == d && points[3] == b)) {
        return true;
    }
    
    if (a != points[0]) {
        swap(a, c);
        swap(b, d);
    }
    if (a > b) swap(a, b);  
    if (c > d) swap(c, d);

    return (b < c && d < a); 
}

int main() {
    int t, a, b, c, d;
    cin >> t;
    while (t--) {
        cin >> a >> b >> c >> d;
        a = normalize(a);
        b = normalize(b);
        c = normalize(c);
        d = normalize(d);
        if (doIntersect(a, b, c, d)) {
            cout << "YES" << endl;
        } else {
            cout << "NO" << endl;
        }
    }
    return 0;
}
