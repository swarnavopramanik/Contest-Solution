https://codeforces.com/contest/1954/problem/C

#include <bits/stdc++.h>
using namespace std;
long long int arr[6000000],brr[6000000];
int  main() {
    long long int T;
    cin >> T;
    long long int  n,m,i,j,cnt;
    while (T--) {
        cnt=-1;
        string s1,s2,p1,p2;
        cin>>s1>>s2;
        for(i=0;i<s1.length();i++){
            if(s1[i]!=s2[i]){
                p1.push_back(s1[i]);
                p2.push_back(s2[i]);
                cnt=i;
                break;
            }
            else{
                p1.push_back(s1[i]);
                p2.push_back(s2[i]);
            }
        }
        if(cnt==-1){
            cout<<s1<<"\n";
            cout<<s2<<"\n";
        }
        else{
            for(i=cnt+1;i<s1.length();i++){
                if(s1[cnt]<s2[cnt]){
                    p1.push_back(max(s1[i],s2[i]));
                    p2.push_back(min(s1[i],s2[i]));
                }
                else{
                    p2.push_back(max(s1[i],s2[i]));
                    p1.push_back(min(s1[i],s2[i]));
                }
                
            }
            cout<<p1<<"\n";
            cout<<p2<<"\n";
        }
    }
}
