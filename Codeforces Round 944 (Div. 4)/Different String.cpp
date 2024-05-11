https://codeforces.com/contest/1971/problem/B

#include<bits/stdc++.h>
#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

typedef long long int ll;
#define endl "\n"
#define pb push_back
#define all(x) (x).begin(), (x).end()
const int inf = 1e9 + 10;
const int M = 1e9 + 7;

 
int main()
{
    
ios_base::sync_with_stdio(false); cin.tie(NULL);
    int T;
    cin>>T;
    while(T--){
        string A1,A2;
        cin>>A1;
        int n=A1.length();

        A2=A1;

        reverse(A2.begin(),A2.end());
        int flag=1;
        for(int i=1;i<n;i++){
            if(A1[i]!=A1[i-1]){
                flag=0;
            }
        }
        if(flag==1){
            cout<<"NO"<<endl;
        }
        else{
            for (int i = 1; i < n; i++)
            {
                if(A1[i]!=A1[i-1]){
                    char temp=A1[i];
                    A1[i]=A1[i-1];
                    A1[i-1]=temp;
                    break;
                }
            }
            cout<<"YES"<<endl;
            cout<<A1<<endl;
        }

    }
    return 0;
}
